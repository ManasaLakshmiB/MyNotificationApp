package com.example.mynotificationapp.feature_dictionary.domain.model

import com.example.mynotificationapp.feature_dictionary.data.remote.model.LicenseModel
import com.example.mynotificationapp.feature_dictionary.data.remote.model.MeaningModel
import com.example.mynotificationapp.feature_dictionary.data.remote.model.PhoneticModel
import com.google.gson.annotations.SerializedName

data class Wordinfo(
    @SerializedName("license")
    val license: LicenseModel? = LicenseModel(),
    @SerializedName("meanings")
    val meanings: List<Meaning>? = listOf(),
    @SerializedName("phonetic")
    val phonetic: String? = "",

    @SerializedName("sourceUrls")
    val sourceUrls: List<String>? = listOf(),
    @SerializedName("word")
    val word: String? = ""
)

