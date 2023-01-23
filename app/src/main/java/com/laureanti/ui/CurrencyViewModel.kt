package com.laureanti.ui

import com.laureanti.data.repository.CurrencyRepositoryImpl
import com.laureanti.domain.entity.Currency
import com.laureanti.domain.usecase.*

class CurrencyViewModel() {

    private val repository = CurrencyRepositoryImpl()

    private val getAllCurrencyUseCase = GetAllCurrencyUseCase(repository)
    private val getConvertCurrencyUseCase = GetConvertCurrencyUseCase(repository)

    private val getSavedCurrenciesUseCase = GetSavedCurrenciesUseCase(repository)
    private val AddCurrencyUseCase = AddCurrencyUseCase(repository)
    private val RemoveCurrencyUseCase = RemoveCurrencyUseCase(repository)

    val allCurrenciesList = getAllCurrencyUseCase
    val savedCurrenciesList = getSavedCurrenciesUseCase

    fun addCurrency(currency: Currency){

    }

    fun removeCurrency(currency: Currency){
        //TODO Закомитить существующие изменения
    }

    suspend fun convertCurrency(
        fromCurrency: String,
        toCurrency: String,
        amountCurrency: Int
    ): Double {
        return getConvertCurrencyUseCase(fromCurrency, toCurrency, amountCurrency).result
    }
}