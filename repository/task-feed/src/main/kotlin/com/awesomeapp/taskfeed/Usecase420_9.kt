package com.awesomeapp.taskfeed

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase420_9 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase420_9 UseCase")
    }
}