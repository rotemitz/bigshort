package com.example.bigshort.interactor

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ClearbitInterator(var clearbitRequestService: ClearbitRequestService){
    companion object {
        fun instance() = ClearbitInterator(Retrofit.Builder().baseUrl("https://company-stream.clearbit.com").addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build().create(ClearbitRequestService::class.java))
    }
}