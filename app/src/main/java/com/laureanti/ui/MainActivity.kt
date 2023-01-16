package com.laureanti.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.laureanti.currencyconverter.R
import com.laureanti.data.api.ApiFactory
import com.laureanti.data.mapper.CurrencyMapper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiService = ApiFactory.apiService
        val mapper = CurrencyMapper()

        CoroutineScope(Dispatchers.IO).launch {

            val response = apiService.getAllCurrencies()

            Log.d(
                "TEST",
                mapper.mapJsonRatesToMapCurrencyRates(response).toString()
            )

        }

    }
}