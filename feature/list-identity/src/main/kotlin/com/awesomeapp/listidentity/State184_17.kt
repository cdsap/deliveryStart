package com.awesomeapp.listidentity

sealed class State184_17 {
    data object Loading : State184_17()
    data class Success(val data: String) : State184_17()
    data class Error(val message: String) : State184_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}