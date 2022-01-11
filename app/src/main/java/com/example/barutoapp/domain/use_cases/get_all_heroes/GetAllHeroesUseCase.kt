package com.example.barutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.example.barutoapp.data.repository.Repository
import com.example.barutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }

}