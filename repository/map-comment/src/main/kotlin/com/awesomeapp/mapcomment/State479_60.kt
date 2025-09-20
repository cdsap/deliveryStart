package com.awesomeapp.mapcomment

sealed class State479_60 {
    data object Loading : State479_60()
    data class Success(val data: String) : State479_60()
    data class Error(val message: String) : State479_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}