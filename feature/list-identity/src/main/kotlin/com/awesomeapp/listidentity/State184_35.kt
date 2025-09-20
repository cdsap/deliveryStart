package com.awesomeapp.listidentity

sealed class State184_35 {
    data object Loading : State184_35()
    data class Success(val data: String) : State184_35()
    data class Error(val message: String) : State184_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}