package com.awesomeapp.photouser

sealed class State339_64 {
    data object Loading : State339_64()
    data class Success(val data: String) : State339_64()
    data class Error(val message: String) : State339_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}