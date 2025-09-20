package com.awesomeapp.mapnetwork

sealed class State675_15 {
    data object Loading : State675_15()
    data class Success(val data: String) : State675_15()
    data class Error(val message: String) : State675_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}