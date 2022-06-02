package com.github.disterru.currencymoodchecker.service

interface OxrService {
    fun getCurrentRate(): Double
    fun getYesterdayRate(): Double
    fun getOneDayDifference(): Double
}