package com.awesomeapp.settingcheckout

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase216_7 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase216_7 UseCase")
    }
}