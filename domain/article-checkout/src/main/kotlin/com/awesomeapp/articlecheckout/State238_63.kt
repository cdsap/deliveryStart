package com.awesomeapp.articlecheckout

sealed class State238_63 {
    data object Loading : State238_63()
    data class Success(val data: String) : State238_63()
    data class Error(val message: String) : State238_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}