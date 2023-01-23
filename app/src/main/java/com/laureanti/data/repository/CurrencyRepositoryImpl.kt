package com.laureanti.data.repository

import com.laureanti.data.datasource.CurrencyLocalDataSourceImpl
import com.laureanti.data.datasource.CurrencyRemoteDataSourceImpl
import com.laureanti.data.mapper.CurrencyApiMapper
import com.laureanti.data.mapper.CurrencyDbMapper
import com.laureanti.domain.entity.ConvertCurrency
import com.laureanti.domain.entity.Currency
import com.laureanti.domain.repository.CurrencyRepository

class CurrencyRepositoryImpl : CurrencyRepository {

    private val remoteDataSourceImpl = CurrencyRemoteDataSourceImpl()
    private val localDataSourceImpl = CurrencyLocalDataSourceImpl()
    private val apiMapper = CurrencyApiMapper()
    private val dbMapper = CurrencyDbMapper()

    override suspend fun getAllCurrencies(): List<Currency> {
        return apiMapper.mapJsonRatesToListCurrency(remoteDataSourceImpl.getAllCurrencies())
    }

    override suspend fun getConvertCurrency(
        fromSymbol: String,
        to: String,
        amount: Int
    ): ConvertCurrency {
        return apiMapper.mapDtoToEntity(
            remoteDataSourceImpl.getConvertCurrency(
                fromSymbol,
                to,
                amount
            )
        )
            ?: throw RuntimeException("getConvertCurrency return null")
    }

    override suspend fun addCurrency(currency: Currency) {
        localDataSourceImpl.addCurrency(currency)
    }

    override suspend fun removeCurrency(currency: Currency) {
        localDataSourceImpl.removeCurrency(currency)
    }

    override suspend fun getSavedCurrencies(): List<Currency> {
        return dbMapper.mapListDbModelToListEntity(localDataSourceImpl.getCurrenciesList())
    }


}