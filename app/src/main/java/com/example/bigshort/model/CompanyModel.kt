package com.example.bigshort.model

import com.google.gson.annotations.SerializedName
import java.security.ProtectionDomain

data class CompanyModel(val id: String, val name: String, val logo: String, val type: String, val domain: String, val description: String, @SerializedName("category") val industry: CompanyIndustryModel, val metrics: CompanyMetrics, @SerializedName("geo") val location: CompanyGeoLocation)
