package com.example.mynotificationapp.feature_dictionary.data.remote.model


import com.google.gson.annotations.SerializedName

data class LicenseModel(
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("url")
    val url: String? = ""
)