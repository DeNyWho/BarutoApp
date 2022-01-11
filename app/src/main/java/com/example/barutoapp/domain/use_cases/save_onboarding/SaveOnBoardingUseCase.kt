package com.example.barutoapp.domain.use_cases.save_onboarding

import com.example.barutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke (completed: Boolean){
        repository.saveOnBoardingState(completed = completed)
    }
}