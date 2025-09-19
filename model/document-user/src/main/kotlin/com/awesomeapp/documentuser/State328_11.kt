package com.awesomeapp.documentuser

sealed class State328_11 {
    data object Loading : State328_11()
    data class Success(val data: String) : State328_11()
    data class Error(val message: String) : State328_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}