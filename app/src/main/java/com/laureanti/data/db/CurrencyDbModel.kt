package com.laureanti.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "currencies_list")
data class CurrencyDbModel(
    @PrimaryKey
    val name: String
)