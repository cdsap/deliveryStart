package com.awesomeapp.profilecontact

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class Usecase57_5 @Inject constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase57_5 UseCase")
    }
}