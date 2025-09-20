package com.awesomeapp.searchcomment

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase453_5 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase453_5 UseCase")
    }
}