package com.awesomeapp.listidentity

sealed class State184_80 {
    data object Loading : State184_80()
    data class Success(val data: String) : State184_80()
    data class Error(val message: String) : State184_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}