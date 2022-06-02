package com.github.disterru.currencymoodchecker.service

import com.github.disterru.currencymoodchecker.component.web.giphy.GiphyClient
import com.github.disterru.currencymoodchecker.component.web.giphy.GiphyMetadataClient
import com.github.disterru.currencymoodchecker.config.GiphyProperties
import com.github.disterru.currencymoodchecker.exception.GiphyMetadataNotFoundException
import org.springframework.stereotype.Service

@Service
class GiphyServiceImpl(
    private val giphyClient: GiphyClient,
    private val metadataClient: GiphyMetadataClient,
    private val properties: GiphyProperties,
) : GiphyService {

    override fun getGif(topic: String): ByteArray {
        val id = getRandomGifId(topic)
        return getGifById(id)
    }

    private fun getRandomGifId(topic: String): String =
        metadataClient.getMetadata(topic = topic, apiKey = properties.key)
            .data
            .randomOrNull()
            ?.id
            ?: throw GiphyMetadataNotFoundException(topic)

    private fun getGifById(id: String): ByteArray = giphyClient.getGif(id)
}