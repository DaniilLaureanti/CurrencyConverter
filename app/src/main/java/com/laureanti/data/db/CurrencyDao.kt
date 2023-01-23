package com.laureanti.data.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CurrencyDao {

    @Query("SELECT * FROM currencies_list ORDERED BY name DESC")
    fun getCurrenciesList(): LiveData<CurrencyDbModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrency(currency: CurrencyDbModel)

    @Query("DELETE FROM currencies_list WHERE name = :currencyName")
    suspend fun deleteCurrency(currencyName: String)
}