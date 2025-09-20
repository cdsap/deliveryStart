package com.awesomeapp.identitylogin

sealed class State102_73 {
    data object Loading : State102_73()
    data class Success(val data: String) : State102_73()
    data class Error(val message: String) : State102_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}