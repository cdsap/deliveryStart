package com.awesomeapp.userlogin

sealed class State105_72 {
    data object Loading : State105_72()
    data class Success(val data: String) : State105_72()
    data class Error(val message: String) : State105_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}