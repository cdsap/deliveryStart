package com.awesomeapp.searchlocation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase600_9 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase600_9 UseCase")
    }
}