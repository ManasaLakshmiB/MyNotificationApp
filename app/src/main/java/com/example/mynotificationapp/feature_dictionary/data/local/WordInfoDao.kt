package com.example.mynotificationapp.feature_dictionary.data.local

import android.provider.UserDictionary.Words
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mynotificationapp.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {
//insert into database
   // if we try to insert element if it is already in db simply replce
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfo(infos:List<WordInfoEntity>)

    //delete all infos(not all just list ) in database because to update new words we will clear database
    @Query("DELETE FROM wordinfoentity WHERE word IN(:words)")
    suspend fun deleteWordInfo(words: List<String>)

    //read it from database if we want to load that from cache
    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%'")
    suspend fun getWordInfo(word:String):List<WordInfoEntity>
}