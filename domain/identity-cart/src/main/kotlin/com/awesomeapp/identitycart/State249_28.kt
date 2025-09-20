package com.awesomeapp.identitycart

sealed class State249_28 {
    data object Loading : State249_28()
    data class Success(val data: String) : State249_28()
    data class Error(val message: String) : State249_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}