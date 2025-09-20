package com.awesomeapp.mediaprofile

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase390_7 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase390_7 UseCase")
    }
}