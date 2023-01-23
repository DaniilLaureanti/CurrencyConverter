package com.laureanti.domain.usecase

import com.laureanti.domain.repository.CurrencyRepository

class GetSavedCurrenciesUseCase(
    private val repository: CurrencyRepository

) {
    suspend operator fun invoke() = repository.getSavedCurrencies()
}