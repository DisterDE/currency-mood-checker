package com.github.disterru.currencymoodchecker.service

interface OxrService {
    fun getCurrentRate(currency: String): Double
    fun getYesterdayRate(currency: String): Double
    fun getOneDayDifference(currency: String): Double
}