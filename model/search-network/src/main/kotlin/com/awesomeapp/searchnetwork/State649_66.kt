package com.awesomeapp.searchnetwork

sealed class State649_66 {
    data object Loading : State649_66()
    data class Success(val data: String) : State649_66()
    data class Error(val message: String) : State649_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}