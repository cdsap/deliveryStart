package com.awesomeapp.networkcheckout

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase210_7 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase210_7 UseCase")
    }
}