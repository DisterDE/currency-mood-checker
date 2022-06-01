package com.github.disterru.currencymoodchecker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CurrencyMoodCheckerApplication

fun main(args: Array<String>) {
    runApplication<CurrencyMoodCheckerApplication>(*args)
}
