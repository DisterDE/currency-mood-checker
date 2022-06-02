package com.github.disterru.currencymoodchecker.controller

import com.github.disterru.currencymoodchecker.service.OxrService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/currency")
class CurrencyController(private val service: OxrService) {

    @GetMapping("/current")
    fun getCurrentRate() = service.getCurrentRate()

    @GetMapping("/yesterday")
    fun getYesterdayRate() = service.getYesterdayRate()

    @GetMapping("/difference")
    fun getOneDayDifference() = service.getOneDayDifference()
}