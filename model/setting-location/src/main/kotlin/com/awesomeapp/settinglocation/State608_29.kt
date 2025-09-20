package com.awesomeapp.settinglocation

sealed class State608_29 {
    data object Loading : State608_29()
    data class Success(val data: String) : State608_29()
    data class Error(val message: String) : State608_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}