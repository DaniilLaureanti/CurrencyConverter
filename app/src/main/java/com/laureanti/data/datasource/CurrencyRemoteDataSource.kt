package com.laureanti.data.datasource

import com.laureanti.data.network.model.ConvertCurrencyDto
import com.laureanti.data.network.model.CurrencyDto

interface CurrencyRemoteDataSource {

    suspend fun getAllCurrencies(): CurrencyDto
    suspend fun getConvertCurrency(from: String, to: String, amount: Int): ConvertCurrencyDto
}