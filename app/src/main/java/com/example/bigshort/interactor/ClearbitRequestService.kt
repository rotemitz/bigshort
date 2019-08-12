package com.example.bigshort.interactor

import com.example.bigshort.model.CompanyModel
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ClearbitRequestService {
    @GET("/v2/companies/find")
    fun getCompanyShortDetails(@Query("domain") domain: String, @Header("Authorization") token: String) : Single<CompanyModel>
}