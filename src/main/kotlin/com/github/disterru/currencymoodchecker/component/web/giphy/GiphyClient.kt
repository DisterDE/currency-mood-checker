package com.github.disterru.currencymoodchecker.component.web.giphy

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(value = "gif-client", url = "\${giphy.api.url.gif}")
interface GiphyClient {

    @GetMapping("/{id}/giphy.gif", produces = ["image/gif"])
    fun getGif(@PathVariable id: String): ByteArray
}