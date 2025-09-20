package com.awesomeapp.logpost

sealed class State515_92 {
    data object Loading : State515_92()
    data class Success(val data: String) : State515_92()
    data class Error(val message: String) : State515_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}