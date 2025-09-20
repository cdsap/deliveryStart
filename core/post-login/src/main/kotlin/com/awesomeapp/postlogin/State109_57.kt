package com.awesomeapp.postlogin

sealed class State109_57 {
    data object Loading : State109_57()
    data class Success(val data: String) : State109_57()
    data class Error(val message: String) : State109_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}