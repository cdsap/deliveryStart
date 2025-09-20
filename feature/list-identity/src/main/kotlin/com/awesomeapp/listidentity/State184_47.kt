package com.awesomeapp.listidentity

sealed class State184_47 {
    data object Loading : State184_47()
    data class Success(val data: String) : State184_47()
    data class Error(val message: String) : State184_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}