package com.awesomeapp.photologin

sealed class State143_51 {
    data object Loading : State143_51()
    data class Success(val data: String) : State143_51()
    data class Error(val message: String) : State143_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}