package com.laureanti.data.repository

import com.laureanti.data.datasource.CurrencyRemoteDataSourceImpl
import com.laureanti.data.mapper.CurrencyMapper
import com.laureanti.domain.entity.ConvertCurrency
import com.laureanti.domain.entity.Currency
import com.laureanti.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl : CurrencyRepository {

    private val remoteDataSourceImpl = CurrencyRemoteDataSourceImpl()
    private val mapper = CurrencyMapper()

    override suspend fun getAllCurrencies(): List<Currency> {
        return mapper.mapJsonRatesToListCurrency(remoteDataSourceImpl.getAllCurrencies())
    }

    override suspend fun getConvertCurrency(
        fromSymbol: String,
        to: String,
        amount: Int
    ): ConvertCurrency {
        return mapper.mapDtoToEntity(remoteDataSourceImpl.getConvertCurrency(fromSymbol, to, amount))
            ?: throw RuntimeException("getConvertCurrency return null")
    }

}