package com.awesomeapp.syncnetwork

sealed class State652_80 {
    data object Loading : State652_80()
    data class Success(val data: String) : State652_80()
    data class Error(val message: String) : State652_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}