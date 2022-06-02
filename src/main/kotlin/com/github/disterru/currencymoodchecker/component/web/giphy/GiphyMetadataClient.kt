package com.github.disterru.currencymoodchecker.component.web.giphy

import com.github.disterru.currencymoodchecker.model.GiphyApiResult
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@FeignClient(value = "giphy-metadata-client", url = "api.giphy.com/v1/gifs/search")
interface GiphyMetadataClient {

    @GetMapping(produces = ["application/json"])
    fun getMetadata(
        @RequestParam("q") topic: String,
        @RequestParam limit: Int = 100,
        @RequestParam("api_key") apiKey: String
    ): GiphyApiResult
}