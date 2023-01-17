package com.laureanti.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.laureanti.currencyconverter.R
import com.laureanti.data.datasource.CurrencyRemoteDataSourceImpl
import com.laureanti.data.network.api.ApiFactory
import com.laureanti.data.mapper.CurrencyMapper
import com.laureanti.data.repository.CurrencyRepositoryImpl
import com.laureanti.domain.repository.CurrencyRepository
import com.laureanti.domain.usecase.GetAllCurrencyUseCase
import com.laureanti.domain.usecase.GetConvertCurrencyUseCase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {

        }

    }
}