package com.awesomeapp.postlogin

sealed class State109_81 {
    data object Loading : State109_81()
    data class Success(val data: String) : State109_81()
    data class Error(val message: String) : State109_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}