package com.laureanti.domain.usecase

import com.laureanti.domain.repository.CurrencyRepository

class GetAllCurrencyUseCase(
    private val repository: CurrencyRepository
    ) {
    suspend operator fun invoke() = repository.getAllCurrencies()
}