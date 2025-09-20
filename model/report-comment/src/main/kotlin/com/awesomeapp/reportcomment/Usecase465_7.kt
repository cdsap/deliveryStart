package com.awesomeapp.reportcomment

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase465_7 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase465_7 UseCase")
    }
}