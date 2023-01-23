package com.laureanti.domain.usecase

import com.laureanti.domain.entity.Currency
import com.laureanti.domain.repository.CurrencyRepository

class RemoveCurrencyUseCase(
    private val repository: CurrencyRepository

) {
    suspend operator fun invoke(currency: Currency) = repository.removeCurrency(currency)
}