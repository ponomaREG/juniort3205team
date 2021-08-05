package com.team3205.junior.domain.usecase

import com.team3205.junior.data.repository.MainRepository
import javax.inject.Inject

class SaveSearchUseCase @Inject constructor(
    private val mainRepository: MainRepository
) {
    suspend operator fun invoke(username: String){
        mainRepository.saveRecentSearch(username)
    }
}