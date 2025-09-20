package com.awesomeapp.cartuser

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase300_9 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase300_9 UseCase")
    }
}