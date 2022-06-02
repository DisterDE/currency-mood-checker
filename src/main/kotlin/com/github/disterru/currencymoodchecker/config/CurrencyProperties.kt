package com.github.disterru.currencymoodchecker.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "rates")
class CurrencyProperties {
    lateinit var key: String
    lateinit var base: String
    lateinit var currency: String
}