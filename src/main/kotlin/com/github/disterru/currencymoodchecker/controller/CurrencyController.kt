package com.github.disterru.currencymoodchecker.controller

import com.github.disterru.currencymoodchecker.service.OxrService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/currency")
class CurrencyController(private val service: OxrService) {

    @GetMapping("/{currency}/current")
    fun getCurrentRate(@PathVariable currency: String) = service.getCurrentRate(currency)

    @GetMapping("/{currency}/yesterday")
    fun getYesterdayRate(@PathVariable currency: String) = service.getYesterdayRate(currency)

    @GetMapping("/{currency}/difference")
    fun getOneDayDifference(@PathVariable currency: String) = service.getOneDayDifference(currency)
}