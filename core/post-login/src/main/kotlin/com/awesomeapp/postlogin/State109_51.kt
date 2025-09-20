package com.awesomeapp.postlogin

sealed class State109_51 {
    data object Loading : State109_51()
    data class Success(val data: String) : State109_51()
    data class Error(val message: String) : State109_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}