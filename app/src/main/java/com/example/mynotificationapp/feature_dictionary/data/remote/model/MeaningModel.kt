package com.example.mynotificationapp.feature_dictionary.data.remote.model


import com.example.mynotificationapp.feature_dictionary.domain.model.Meaning
import com.google.gson.annotations.SerializedName

data class MeaningModel(
    @SerializedName("antonyms")
    val antonyms: List<Any?>? = listOf(),
    @SerializedName("definitions")
    val definitions: List<DefinitionModel> = listOf(),
    @SerializedName("partOfSpeech")
    val partOfSpeech: String = "",
    @SerializedName("synonyms")
    val synonyms: List<String?>? = listOf()
){
    fun toMeaning():Meaning {
        return Meaning(
        definitions = definitions.map { it.toDefinition()  } ,
        partOfSpeech = partOfSpeech
        )

    }
}