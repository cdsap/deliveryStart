package com.awesomeapp.syncnetwork

sealed class State652_98 {
    data object Loading : State652_98()
    data class Success(val data: String) : State652_98()
    data class Error(val message: String) : State652_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}