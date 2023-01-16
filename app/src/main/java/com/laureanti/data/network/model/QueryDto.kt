package com.laureanti.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class QueryDto(

    @SerializedName("from")
    @Expose
    var from: String? = null,

    @SerializedName("to")
    @Expose
    var to: String? = null,

    @SerializedName("amount")
    @Expose
    var amount: Int? = null

)