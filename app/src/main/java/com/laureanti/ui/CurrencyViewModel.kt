package com.laureanti.ui

import com.laureanti.data.repository.CurrencyRepositoryImpl
import com.laureanti.domain.usecase.GetAllCurrencyUseCase
import com.laureanti.domain.usecase.GetConvertCurrencyUseCase

class CurrencyViewModel() {

    private val repository = CurrencyRepositoryImpl()
    private val getAllCurrencyUseCase = GetAllCurrencyUseCase(repository)
    private val getConvertCurrencyUseCase = GetConvertCurrencyUseCase(repository)

    val currenciesList = getAllCurrencyUseCase

    suspend fun convertCurrency(
        fromCurrency: String,
        toCurrency: String,
        amountCurrency: Int
    ): Double {
        return getConvertCurrencyUseCase(fromCurrency, toCurrency, amountCurrency).result
    }
}