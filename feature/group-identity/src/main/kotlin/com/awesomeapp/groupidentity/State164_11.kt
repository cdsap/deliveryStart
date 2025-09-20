package com.awesomeapp.groupidentity

sealed class State164_11 {
    data object Loading : State164_11()
    data class Success(val data: String) : State164_11()
    data class Error(val message: String) : State164_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}