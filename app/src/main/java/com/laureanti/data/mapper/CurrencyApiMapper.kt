package com.laureanti.data.mapper

import com.laureanti.data.network.model.ConvertCurrencyDto
import com.laureanti.data.network.model.CurrencyDto
import com.laureanti.domain.entity.ConvertCurrency
import com.laureanti.domain.entity.Currency

class CurrencyApiMapper {

    fun mapDtoToEntity(convertCurrencyDto: ConvertCurrencyDto) = convertCurrencyDto.result?.let {
        ConvertCurrency(
            result = it
        )
    }

    fun mapJsonRatesToListCurrency(jsonRates: CurrencyDto): List<Currency> {
        val listCurrencyNames = mapJsonRatesToListCurrencyNames(jsonRates)
        val listCurrencies = listCurrencyNames?.let { mapListCurrencyNamesToListCurrency(it) }
        return listCurrencies ?: throw RuntimeException("Api return null")
    }

    private fun mapJsonRatesToListCurrencyNames(jsonRates: CurrencyDto): List<String>? {
        val currencyNames = mutableListOf<String>()

        val jsonObject = jsonRates.jsonRates ?: return null
        val currencyKeySet = jsonObject.keySet()

        for (currencyKey in currencyKeySet) {
            currencyNames.add(currencyKey)

        }
        return currencyNames
    }

    private fun mapListCurrencyNamesToListCurrency(listCurrencyNames: List<String>): List<Currency> {
        val listCurrency = mutableListOf<Currency>()
        for (currencyName in listCurrencyNames) {
            listCurrency.add(Currency(currencyName))
        }
        return listCurrency
    }

}