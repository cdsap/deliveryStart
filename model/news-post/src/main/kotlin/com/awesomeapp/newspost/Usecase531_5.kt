package com.awesomeapp.newspost

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase531_5 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase531_5 UseCase")
    }
}