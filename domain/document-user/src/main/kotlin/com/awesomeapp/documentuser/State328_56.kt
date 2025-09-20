package com.awesomeapp.documentuser

sealed class State328_56 {
    data object Loading : State328_56()
    data class Success(val data: String) : State328_56()
    data class Error(val message: String) : State328_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}