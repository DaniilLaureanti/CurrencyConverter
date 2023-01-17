package com.laureanti.domain.usecase

import com.laureanti.domain.repository.CurrencyRepository

class GetConvertCurrencyUseCase(
    private val repository: CurrencyRepository
) {
    suspend operator fun invoke(
        from: String,
        to: String,
        amount: Int
    ) = repository.getConvertCurrency(from, to, amount)
}