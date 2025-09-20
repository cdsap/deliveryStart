package com.awesomeapp.networkcomment

sealed class State455_77 {
    data object Loading : State455_77()
    data class Success(val data: String) : State455_77()
    data class Error(val message: String) : State455_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}