package com.example.bigshort.model

data class CompanyGeoLocation(val streetNumber: String,
                              val streetName: String,
                              val subPremise: String?,
                              val city: String,
                              val postalCode: String,
                              val state: String?,
                              val stateCode: String?,
                              val country: String,
                              val countryCode: String,
                              val lat: Float,
                              val lng: Float)