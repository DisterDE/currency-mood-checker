package com.github.disterru.currencymoodchecker.model

data class GiphyApiResult(
    val data: List<GifMetadata>
)

data class GifMetadata(
    val id: String
)
