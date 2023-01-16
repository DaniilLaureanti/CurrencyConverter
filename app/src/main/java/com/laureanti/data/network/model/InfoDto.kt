package com.laureanti.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class InfoDto(

    @SerializedName("rate")
    @Expose
    var rate: Double? = null

)
