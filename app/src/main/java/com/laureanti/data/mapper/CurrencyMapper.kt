package com.laureanti.data.mapper

import com.laureanti.data.network.model.CurrencyDto

class CurrencyMapper {

    fun mapJsonRatesToMapCurrencyRates(jsonRates: CurrencyDto): Map<String, Double>? {
        val mapCurrencyRates = mutableMapOf<String, Double>()

        val jsonObject = jsonRates.jsonRates ?: return null
        val currencyKeySet = jsonObject.keySet()

        for (currencyKey in currencyKeySet) {
            mapCurrencyRates[currencyKey] = jsonObject.get(currencyKey).asDouble

        }
        return mapCurrencyRates
    }

}