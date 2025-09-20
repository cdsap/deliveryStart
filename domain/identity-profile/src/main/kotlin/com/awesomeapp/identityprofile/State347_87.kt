package com.awesomeapp.identityprofile

sealed class State347_87 {
    data object Loading : State347_87()
    data class Success(val data: String) : State347_87()
    data class Error(val message: String) : State347_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}