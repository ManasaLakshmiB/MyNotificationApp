package com.example.mynotificationapp.feature_dictionary.domain.repository

import com.example.mynotificationapp.core.util.Resource
import com.example.mynotificationapp.feature_dictionary.domain.model.Wordinfo
import kotlinx.coroutines.flow.Flow


interface WordInfoRepository {

    fun getWordInfo(word:String): Flow<Resource<List<Wordinfo>>>

}