package com.laureanti.data.datasource

import com.laureanti.data.network.api.ApiFactory
import com.laureanti.data.network.model.ConvertCurrencyDto
import com.laureanti.data.network.model.CurrencyDto

class CurrencyRemoteDataSourceImpl : CurrencyRemoteDataSource {

    private val apiService = ApiFactory.apiService

    override suspend fun getAllCurrencies(): CurrencyDto {
        return apiService.getAllCurrencies()
    }

    override suspend fun getConvertCurrency(
        from: String,
        to: String,
        amount: Int
    ): ConvertCurrencyDto {
        return apiService.getConvertCurrencies(from = from, to = to, amount = amount)
    }


}