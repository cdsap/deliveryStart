package com.awesomeapp.weathercomment

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase480_9 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase480_9 UseCase")
    }
}