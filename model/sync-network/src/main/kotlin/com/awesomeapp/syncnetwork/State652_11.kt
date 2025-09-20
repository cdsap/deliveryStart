package com.awesomeapp.syncnetwork

sealed class State652_11 {
    data object Loading : State652_11()
    data class Success(val data: String) : State652_11()
    data class Error(val message: String) : State652_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}