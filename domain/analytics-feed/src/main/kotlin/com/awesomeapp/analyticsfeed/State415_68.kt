package com.awesomeapp.analyticsfeed

sealed class State415_68 {
    data object Loading : State415_68()
    data class Success(val data: String) : State415_68()
    data class Error(val message: String) : State415_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}