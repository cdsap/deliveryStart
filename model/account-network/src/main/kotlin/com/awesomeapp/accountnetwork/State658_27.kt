package com.awesomeapp.accountnetwork

sealed class State658_27 {
    data object Loading : State658_27()
    data class Success(val data: String) : State658_27()
    data class Error(val message: String) : State658_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}