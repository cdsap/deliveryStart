package com.awesomeapp.searchnetwork

sealed class State649_108 {
    data object Loading : State649_108()
    data class Success(val data: String) : State649_108()
    data class Error(val message: String) : State649_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}