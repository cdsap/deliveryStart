package com.awesomeapp.metriclocation

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase615_7 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase615_7 UseCase")
    }
}