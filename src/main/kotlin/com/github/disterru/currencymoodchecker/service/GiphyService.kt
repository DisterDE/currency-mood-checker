package com.github.disterru.currencymoodchecker.service


interface GiphyService {
    fun getGif(topic: String): ByteArray
}