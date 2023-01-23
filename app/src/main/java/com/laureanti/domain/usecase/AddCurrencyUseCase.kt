package com.laureanti.domain.usecase

import com.laureanti.domain.entity.Currency
import com.laureanti.domain.repository.CurrencyRepository

class AddCurrencyUseCase(
    private val repository: CurrencyRepository

) {
    suspend operator fun invoke(currency: Currency) = repository.addCurrency(currency)
}