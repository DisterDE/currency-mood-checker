package com.github.disterru.currencymoodchecker.exception

class CurrencyNotFoundException(currency: String) : RuntimeException("Currency $currency not found")
