package com.awesomeapp.identitycart

sealed class State249_43 {
    data object Loading : State249_43()
    data class Success(val data: String) : State249_43()
    data class Error(val message: String) : State249_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}