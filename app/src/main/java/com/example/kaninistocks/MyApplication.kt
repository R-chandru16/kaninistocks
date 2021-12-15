package com.example.kaninistocks

import android.app.Application
import com.fasterxml.jackson.databind.ObjectMapper
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
// this is for base url
class MyApplication:Application() {
    public lateinit var httpApiService: HttpApiService

    override fun onCreate() {
        super.onCreate()
        httpApiService=initHttpApiService()
    }

    private fun initHttpApiService():HttpApiService{
        val retrofit = Retrofit.Builder()
            .baseUrl("https://android-kanini-course.cloud/priceapp-secure-backend/")
            .addConverterFactory(JacksonConverterFactory.create(ObjectMapper()))
            .build()
        return retrofit.create(HttpApiService::class.java)
    }
}