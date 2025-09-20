package com.awesomeapp.listnetwork

sealed class State674_66 {
    data object Loading : State674_66()
    data class Success(val data: String) : State674_66()
    data class Error(val message: String) : State674_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}