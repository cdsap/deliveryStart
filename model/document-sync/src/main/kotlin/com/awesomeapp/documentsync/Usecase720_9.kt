package com.awesomeapp.documentsync

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase720_9 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase720_9 UseCase")
    }
}