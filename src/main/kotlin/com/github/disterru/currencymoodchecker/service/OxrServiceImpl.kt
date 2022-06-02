package com.github.disterru.currencymoodchecker.service

import com.github.disterru.currencymoodchecker.component.web.oxr.RatesClient
import com.github.disterru.currencymoodchecker.config.CurrencyProperties
import com.github.disterru.currencymoodchecker.exception.CurrencyNotFoundException
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class OxrServiceImpl(
    private val ratesClient: RatesClient,
    private val properties: CurrencyProperties
) : OxrService {

    override fun getCurrentRate(currency: String): Double {
        return ratesClient.getCurrentRates(properties.key, properties.base)
            .rates[currency]
            ?: throw CurrencyNotFoundException(properties.currency)
    }


    override fun getYesterdayRate(currency: String): Double {
        val yesterday = LocalDate.now().minusDays(1)
        return ratesClient.getHistoricalRates(
            properties.key,
            properties.base,
            yesterday.toString()
        ).rates[currency]
            ?: throw CurrencyNotFoundException(properties.currency)
    }

//    Only for paid subscription
//    override fun getOneDayDifference(): Double {
//        val today = LocalDate.now().toString()
//        val yesterday = LocalDate.now().minusDays(1).toString()
//        val map = ratesClient.getTimeSeries(
//            properties.key,
//            properties.base,
//            yesterday,
//            today
//        ).rates.mapValues {
//            it.value[properties.currency]
//        }
//        return map[today]!! - map[yesterday]!!
//    }

    override fun getOneDayDifference(currency: String): Double {
        return getCurrentRate(currency) - getYesterdayRate(currency)
    }
}