package com.awesomeapp.documentuser

sealed class State328_110 {
    data object Loading : State328_110()
    data class Success(val data: String) : State328_110()
    data class Error(val message: String) : State328_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}