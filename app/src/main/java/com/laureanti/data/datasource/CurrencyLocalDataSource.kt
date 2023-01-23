package com.laureanti.data.datasource

import com.laureanti.data.db.CurrencyDbModel
import com.laureanti.domain.entity.Currency

interface CurrencyLocalDataSource {

    fun getCurrenciesList(): List<CurrencyDbModel>

    fun removeCurrency(currency: Currency)

    fun addCurrency(currency: Currency)
}