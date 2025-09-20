package com.awesomeapp.loglocation

sealed class State613_51 {
    data object Loading : State613_51()
    data class Success(val data: String) : State613_51()
    data class Error(val message: String) : State613_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}