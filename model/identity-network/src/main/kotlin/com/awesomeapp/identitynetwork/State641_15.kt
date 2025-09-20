package com.awesomeapp.identitynetwork

sealed class State641_15 {
    data object Loading : State641_15()
    data class Success(val data: String) : State641_15()
    data class Error(val message: String) : State641_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}