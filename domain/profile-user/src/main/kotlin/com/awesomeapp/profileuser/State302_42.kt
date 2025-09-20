package com.awesomeapp.profileuser

sealed class State302_42 {
    data object Loading : State302_42()
    data class Success(val data: String) : State302_42()
    data class Error(val message: String) : State302_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}