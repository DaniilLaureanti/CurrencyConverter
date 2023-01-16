package com.laureanti.data.api

import com.laureanti.data.network.model.ConvertCurrencyDto
import com.laureanti.data.network.model.CurrencyDto
import com.squareup.picasso.Picasso.LoadedFrom
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET(QUERY_ALL_CURRENCIES)
    suspend fun getAllCurrencies(): CurrencyDto

    @GET(QUERY_CONVERT_CURRENCY)
    suspend fun getConvertCurrencies(
        @Query(QUERY_PARAM_FROM_SYMBOLS) from: String = CURRENCY_FROM,
        @Query(QUERY_PARAM_TO_SYMBOLS) to: String = CURRENCY_TO,
        @Query(QUERY_PARAM_AMOUNT) amount: Int = CURRENCY_AMOUNT
    ): ConvertCurrencyDto

    companion object {
        private const val QUERY_ALL_CURRENCIES = "latest"
        private const val QUERY_CONVERT_CURRENCY = "convert?"

        private const val QUERY_PARAM_FROM_SYMBOLS = "from"
        private const val QUERY_PARAM_TO_SYMBOLS = "to"
        private const val QUERY_PARAM_AMOUNT = "amount"

        private const val CURRENCY_FROM = "USD"
        private const val CURRENCY_TO = "EUR"
        private const val CURRENCY_AMOUNT = 1200
    }
}