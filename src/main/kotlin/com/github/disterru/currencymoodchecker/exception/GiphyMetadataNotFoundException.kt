package com.github.disterru.currencymoodchecker.exception

class GiphyMetadataNotFoundException(topic: String) :
    RuntimeException("Gif for topic $topic not found")
