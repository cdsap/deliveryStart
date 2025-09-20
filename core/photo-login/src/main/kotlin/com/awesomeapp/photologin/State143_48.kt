package com.awesomeapp.photologin

sealed class State143_48 {
    data object Loading : State143_48()
    data class Success(val data: String) : State143_48()
    data class Error(val message: String) : State143_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}