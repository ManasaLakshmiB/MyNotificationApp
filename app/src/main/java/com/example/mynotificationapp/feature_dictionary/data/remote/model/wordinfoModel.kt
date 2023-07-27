package com.example.mynotificationapp.feature_dictionary.data.remote.model


import com.example.mynotificationapp.feature_dictionary.data.local.entity.WordInfoEntity
import com.example.mynotificationapp.feature_dictionary.domain.model.Wordinfo
import com.google.gson.annotations.SerializedName

data class  wordinfoModel(
    @SerializedName("license")
    val license: LicenseModel? = LicenseModel(),
    @SerializedName("meanings")
    val meanings: List<MeaningModel> = listOf(),
    @SerializedName("phonetic")
    val phonetic: String? = "",
    @SerializedName("phonetics")
    val phonetics: List<PhoneticModel>?= listOf(),
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>? = listOf(),
    @SerializedName("word")
    val word: String? = ""
){
    fun toWordInfoEntity():WordInfoEntity{
        return WordInfoEntity(
           meanings = meanings.map { it.toMeaning() },
           phonetic = phonetic,
            word = word
        )
    }
}