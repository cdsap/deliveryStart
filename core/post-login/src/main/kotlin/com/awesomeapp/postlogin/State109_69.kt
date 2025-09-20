package com.awesomeapp.postlogin

sealed class State109_69 {
    data object Loading : State109_69()
    data class Success(val data: String) : State109_69()
    data class Error(val message: String) : State109_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}