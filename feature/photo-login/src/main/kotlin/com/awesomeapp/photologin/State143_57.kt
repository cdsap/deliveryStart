package com.awesomeapp.photologin

sealed class State143_57 {
    data object Loading : State143_57()
    data class Success(val data: String) : State143_57()
    data class Error(val message: String) : State143_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}