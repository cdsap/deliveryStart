package com.awesomeapp.mapcomment

sealed class State479_42 {
    data object Loading : State479_42()
    data class Success(val data: String) : State479_42()
    data class Error(val message: String) : State479_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}