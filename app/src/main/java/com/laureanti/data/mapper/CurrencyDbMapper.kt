package com.laureanti.data.mapper

import com.laureanti.data.db.CurrencyDbModel
import com.laureanti.domain.entity.Currency

class CurrencyDbMapper {

    fun mapEntityToDbModel(currency: Currency) = CurrencyDbModel(
        name = currency.name
    )

    fun mapDbModelToEntity(currencyDbModel: CurrencyDbModel) = Currency(
        name = currencyDbModel.name
    )

    fun mapListDbModelToListEntity(dbModelList: List<CurrencyDbModel>): List<Currency>{
        val listCurrencies = mutableListOf<Currency>()
        for (i in dbModelList) {
            listCurrencies.add(mapDbModelToEntity(i))
        }
        return listCurrencies
    }
}