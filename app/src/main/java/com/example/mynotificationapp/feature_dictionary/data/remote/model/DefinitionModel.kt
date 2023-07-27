package com.example.mynotificationapp.feature_dictionary.data.remote.model


import com.example.mynotificationapp.feature_dictionary.domain.model.Definition
import com.google.gson.annotations.SerializedName

data class DefinitionModel(
    @SerializedName("antonyms")
    val antonyms: List<String>? = listOf(),
    @SerializedName("definition")
    val definition: String? = "",
    @SerializedName("example")
    val example: String? = "",
    @SerializedName("synonyms")
    val synonyms: List<String?>? = listOf()
){
    fun toDefinition() : Definition{
        return Definition(
            antonyms = antonyms,
        definition = definition,
            example = example,
            synonyms = synonyms
        )
    }
}