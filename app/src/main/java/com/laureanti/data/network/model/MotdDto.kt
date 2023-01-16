package com.laureanti.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MotdDto(

    @SerializedName("msg")
    @Expose
    var msg: String? = null,

    @SerializedName("url")
    @Expose
    var url: String? = null

)
