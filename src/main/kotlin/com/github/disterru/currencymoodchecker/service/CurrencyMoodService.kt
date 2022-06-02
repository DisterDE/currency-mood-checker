package com.github.disterru.currencymoodchecker.service

interface CurrencyMoodService {
    fun getCurrencyMoodGif(currency: String): ByteArray
}