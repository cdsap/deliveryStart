package com.awesomeapp.articlecheckout

sealed class State238_57 {
    data object Loading : State238_57()
    data class Success(val data: String) : State238_57()
    data class Error(val message: String) : State238_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}