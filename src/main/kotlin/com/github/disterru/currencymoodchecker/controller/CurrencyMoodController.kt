package com.github.disterru.currencymoodchecker.controller

import com.github.disterru.currencymoodchecker.service.CurrencyMoodService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mood")
class CurrencyMoodController(private val service: CurrencyMoodService) {

    @GetMapping(produces = ["image/gif"])
    fun getMood() = service.getCurrencyMoodGif()
}