package com.laureanti.data.network.model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CurrencyDto(
    @SerializedName("rates")
    @Expose
    val jsonRates: JsonObject? = null
)