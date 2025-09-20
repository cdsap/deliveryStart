package com.awesomeapp.photologin

sealed class State143_99 {
    data object Loading : State143_99()
    data class Success(val data: String) : State143_99()
    data class Error(val message: String) : State143_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}