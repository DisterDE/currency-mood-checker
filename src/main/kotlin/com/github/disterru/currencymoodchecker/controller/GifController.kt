package com.github.disterru.currencymoodchecker.controller

import com.github.disterru.currencymoodchecker.service.GiphyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/gif")
class GifController(private val giphyService: GiphyService) {

    @GetMapping("/{topic}", produces = ["image/gif"])
    fun getMetadata(@PathVariable topic: String) = giphyService.getGif(topic)
}
