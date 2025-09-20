package com.awesomeapp.groupidentity

sealed class State164_53 {
    data object Loading : State164_53()
    data class Success(val data: String) : State164_53()
    data class Error(val message: String) : State164_53()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}