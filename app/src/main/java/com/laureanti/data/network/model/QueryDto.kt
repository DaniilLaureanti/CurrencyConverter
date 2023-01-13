package com.laureanti.data.network.model

import com.google.gson.annotations.SerializedName


data class QueryDto(

    @SerializedName("from") var from: String? = null,
    @SerializedName("to") var to: String? = null,
    @SerializedName("amount") var amount: Int? = null

)