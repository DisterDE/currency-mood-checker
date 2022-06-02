package com.github.disterru.currencymoodchecker.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "giphy.api")
class GiphyProperties {
    lateinit var key: String
    lateinit var topics: List<String>
}