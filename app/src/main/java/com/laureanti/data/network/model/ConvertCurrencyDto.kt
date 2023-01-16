package com.laureanti.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ConvertCurrencyDto(

    @SerializedName("motd")
    @Expose
    var motdDto: MotdDto? = MotdDto(),

    @SerializedName("success")
    @Expose
    var success: Boolean? = null,

    @SerializedName("query")
    @Expose
    var queryDto: QueryDto? = QueryDto(),

    @SerializedName("info")
    @Expose
    var infoDto: InfoDto? = InfoDto(),

    @SerializedName("historical")
    @Expose
    var historical: Boolean? = null,

    @SerializedName("date")
    @Expose
    var date: String? = null,

    @SerializedName("result")
    @Expose
    var result: Double? = null

)