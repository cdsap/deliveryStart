package com.awesomeapp.accountnetwork

sealed class State658_51 {
    data object Loading : State658_51()
    data class Success(val data: String) : State658_51()
    data class Error(val message: String) : State658_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}