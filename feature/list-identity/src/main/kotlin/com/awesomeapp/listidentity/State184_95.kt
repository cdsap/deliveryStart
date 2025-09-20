package com.awesomeapp.listidentity

sealed class State184_95 {
    data object Loading : State184_95()
    data class Success(val data: String) : State184_95()
    data class Error(val message: String) : State184_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}