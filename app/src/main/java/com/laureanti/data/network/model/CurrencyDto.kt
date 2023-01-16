package com.laureanti.data.network.model

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class CurrencyDto(

    @SerializedName("motd")
    @Expose
    var motdDto: MotdDto? = MotdDto(),

    @SerializedName("success")
    @Expose
    var success: Boolean? = null,

    @SerializedName("base")
    @Expose
    var base: String? = null,

    @SerializedName("date")
    @Expose
    var date: String? = null,

    @SerializedName("rates")
    @Expose
    val jsonRates: JsonObject? = null

)