package com.github.disterru.currencymoodchecker.service

import com.github.disterru.currencymoodchecker.config.GiphyProperties
import org.springframework.stereotype.Service

@Service
class CurrencyMoodServiceImpl(
    private val oxrService: OxrService,
    private val giphyService: GiphyService,
    private val properties: GiphyProperties
) : CurrencyMoodService {

    override fun getCurrencyMoodGif(): ByteArray {
        val currencyIsGood = oxrService.getOneDayDifference() > 0
        return giphyService.getGif(
            if (currencyIsGood) {
                properties.topics.first()
            } else {
                properties.topics.last()
            }
        )
    }
}