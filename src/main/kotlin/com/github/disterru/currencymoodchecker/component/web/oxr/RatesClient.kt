package com.github.disterru.currencymoodchecker.component.web.oxr

import com.github.disterru.currencymoodchecker.model.OxrApiResult
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(name = "rates-client", url = "\${rates.url}")
interface RatesClient {

    @GetMapping("/latest.json")
    fun getCurrentRates(
        @RequestParam("app_id") apiKey: String,
        @RequestParam base: String = "RUB"
    ): OxrApiResult

    @GetMapping("/historical/{date}.json")
    fun getHistoricalRates(
        @RequestParam("app_id") apiKey: String,
        @RequestParam base: String = "RUB",
        @PathVariable date: String
    ): OxrApiResult
}