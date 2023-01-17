package com.laureanti.domain.repository

import com.laureanti.domain.entity.ConvertCurrency
import com.laureanti.domain.entity.Currency

interface CurrencyRepository {

    suspend fun getAllCurrencies(): List<Currency>

    suspend fun getConvertCurrency(fromSymbol: String, to: String, amount: Int): ConvertCurrency
}