package com.github.disterru.currencymoodchecker.service

import com.github.disterru.currencymoodchecker.config.TopicProperties
import org.springframework.stereotype.Service

@Service
class CurrencyMoodServiceImpl(
    private val oxrService: OxrService,
    private val giphyService: GiphyService,
    private val properties: TopicProperties
) : CurrencyMoodService {

    override fun getCurrencyMoodGif(currency: String): ByteArray {
        val currencyIsGood = oxrService.getOneDayDifference(currency) > 0
        return giphyService.getGif(
            if (currencyIsGood) {
                properties.good
            } else {
                properties.bad
            }
        )
    }
}