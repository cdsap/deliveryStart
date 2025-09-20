package com.awesomeapp.searchnetwork

sealed class State649_138 {
    data object Loading : State649_138()
    data class Success(val data: String) : State649_138()
    data class Error(val message: String) : State649_138()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}