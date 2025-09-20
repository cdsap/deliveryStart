package com.awesomeapp.postshare

sealed class State746_24 {
    data object Loading : State746_24()
    data class Success(val data: String) : State746_24()
    data class Error(val message: String) : State746_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}