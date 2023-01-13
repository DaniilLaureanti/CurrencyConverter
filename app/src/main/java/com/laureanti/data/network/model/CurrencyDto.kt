package com.laureanti.data.network.model

import com.google.gson.annotations.SerializedName


data class CurrencyDto(

    @SerializedName("success") var success: Boolean? = null,
    @SerializedName("query") var query: QueryDto? = QueryDto(),
    @SerializedName("info") var info: Info? = Info(),
    @SerializedName("date") var date: String? = null,
    @SerializedName("result") var result: Double? = null

)