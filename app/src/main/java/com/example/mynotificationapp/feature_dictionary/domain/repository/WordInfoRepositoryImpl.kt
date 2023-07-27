package com.example.mynotificationapp.feature_dictionary.domain.repository

import com.example.mynotificationapp.core.util.Resource
import com.example.mynotificationapp.feature_dictionary.data.local.WordInfoDao
import com.example.mynotificationapp.feature_dictionary.data.remote.DictionaryApi
import com.example.mynotificationapp.feature_dictionary.domain.model.Wordinfo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(
    private val api:DictionaryApi,
    private val dao:WordInfoDao
): WordInfoRepository {

   override fun getWordInfo(word:String): Flow<Resource<List<Wordinfo>>> = flow{
       emit(Resource.Loading())

       val wordInfo = dao.getWordInfo(word).map { it.toWordInfo() }
       emit(Resource.Loading(data = wordInfo))

       try {
           val remoteWordInfo = api.getWordInfo(word)
           dao.deleteWordInfo(remoteWordInfo.map { it.word })
           dao.insertWordInfo(remoteWordInfo.map { it.toWordInfoEntity() })

       }catch (e:HttpException){
           emit(Resource.Error(
               message = "ohh! Something went wrong",
               data = wordInfo
           ))

       }catch (e:IOException){
           emit(Resource.Error(
               message = "Couldn't reach server,check your internet connection.",
               data = wordInfo
           ))

       }
       val newWordInfo = dao.getWordInfo(word).map { it.toWordInfo() }
       emit(Resource.Success(newWordInfo))
   }
}