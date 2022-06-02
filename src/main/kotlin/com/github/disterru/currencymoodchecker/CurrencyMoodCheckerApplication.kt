package com.github.disterru.currencymoodchecker

import com.github.disterru.currencymoodchecker.config.CurrencyProperties
import com.github.disterru.currencymoodchecker.config.GiphyProperties
import com.github.disterru.currencymoodchecker.config.TopicProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@EnableConfigurationProperties(
    GiphyProperties::class,
    CurrencyProperties::class,
    TopicProperties::class
)
@SpringBootApplication
class CurrencyMoodCheckerApplication

fun main(args: Array<String>) {
    runApplication<CurrencyMoodCheckerApplication>(*args)
}
