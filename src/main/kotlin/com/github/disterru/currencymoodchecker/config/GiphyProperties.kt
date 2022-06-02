package com.github.disterru.currencymoodchecker.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "giphy.api")
class GiphyProperties {
    lateinit var key: String
}

@ConfigurationProperties(prefix = "giphy.api.topics")
class TopicProperties {
    lateinit var bad: String
    lateinit var good: String
}