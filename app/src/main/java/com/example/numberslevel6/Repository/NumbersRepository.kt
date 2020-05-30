package com.example.numberslevel6.Repository

import NumbersApiService
import com.example.numberslevel6.Services.NumbersApi

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}
