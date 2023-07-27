package com.example.mynotificationapp.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mynotificationapp.feature_dictionary.domain.model.Meaning
import com.example.mynotificationapp.feature_dictionary.domain.model.Wordinfo

@Entity
data class WordInfoEntity(
    val word:String,
    val phonetic:String,
    val origin:String,
    val meaning:List<Meaning>,
    @PrimaryKey
    val id:Int?=null

){
    fun toWordInfo(): Wordinfo {
        return Wordinfo(
        meanings = meaning,
            word = word,
            phonetic = phonetic


        )

    }
}
