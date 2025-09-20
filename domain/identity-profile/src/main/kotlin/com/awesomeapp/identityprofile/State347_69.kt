package com.awesomeapp.identityprofile

sealed class State347_69 {
    data object Loading : State347_69()
    data class Success(val data: String) : State347_69()
    data class Error(val message: String) : State347_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}