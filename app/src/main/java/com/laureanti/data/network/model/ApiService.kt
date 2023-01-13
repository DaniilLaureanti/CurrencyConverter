package com.laureanti.data.network.model

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("latest")
    suspend fun getAllCurrencies(): CurrencyInfoJsonContainerDto

    @GET("convert?")
    suspend fun getConvertCurrencies(
        @Query(QUERY_PARAM_AMOUNT) apiKey: Int = CURRENCY_AMOUNT,
        @Query(QUERY_PARAM_TO_SYMBOLS) fSyms: String = CURRENCY_TO,
        @Query(QUERY_PARAM_FROM_SYMBOLS) tSyms: String = CURRENCY_FROM
    ): CurrencyDto

    companion object {
        private const val QUERY_PARAM_AMOUNT = "amount"
        private const val QUERY_PARAM_TO_SYMBOLS = "to"
        private const val QUERY_PARAM_FROM_SYMBOLS = "amount"

        private const val CURRENCY_AMOUNT = 1200
        private const val CURRENCY_FROM = "USD"
        private const val CURRENCY_TO = "EUR"
    }
}