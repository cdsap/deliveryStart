package com.awesomeapp.todocomment

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase477_5 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase477_5 UseCase")
    }
}