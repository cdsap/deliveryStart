package com.awesomeapp.documentuser

sealed class State328_50 {
    data object Loading : State328_50()
    data class Success(val data: String) : State328_50()
    data class Error(val message: String) : State328_50()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}