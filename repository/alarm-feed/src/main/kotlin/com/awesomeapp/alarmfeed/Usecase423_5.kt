package com.awesomeapp.alarmfeed

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase423_5 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase423_5 UseCase")
    }
}