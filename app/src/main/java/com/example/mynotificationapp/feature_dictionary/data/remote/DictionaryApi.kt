package com.example.mynotificationapp.feature_dictionary.data.remote

import android.provider.UserDictionary.Words
import com.example.mynotificationapp.feature_dictionary.data.remote.model.wordinfoModel
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi  {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word:String
    ):List<wordinfoModel>

    companion object{
        const val BASE_URL="https://api.dictionaryapi.dev/ "
    }



}