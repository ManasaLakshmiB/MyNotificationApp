package com.example.mynotificationapp.feature_dictionary.domain.use_case

import com.example.mynotificationapp.core.util.Resource
import com.example.mynotificationapp.feature_dictionary.domain.model.Wordinfo
import com.example.mynotificationapp.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class GetWordInfo (
    private val repository: WordInfoRepository
    ) {
    operator fun invoke(word:String): Flow<Resource<List<Wordinfo>>> {
        if (word.isBlank()){
    return flow{ }
}
        return repository.getWordInfo(word)
    }
}
