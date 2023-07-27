package com.example.mynotificationapp.feature_dictionary.data.remote.model


import com.google.gson.annotations.SerializedName

data class PhoneticModel(
    @SerializedName("audio")
    val audio: String? = "",
    @SerializedName("license")
    val license: LicenseModel? = LicenseModel(),
    @SerializedName("sourceUrl")
    val sourceUrl: String? = "",
    @SerializedName("text")
    val text: String? = ""
)