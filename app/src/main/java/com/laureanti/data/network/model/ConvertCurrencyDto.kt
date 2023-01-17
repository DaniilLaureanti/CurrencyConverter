package com.laureanti.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ConvertCurrencyDto(
    @SerializedName("result")
    @Expose
    var result: Double? = null
)