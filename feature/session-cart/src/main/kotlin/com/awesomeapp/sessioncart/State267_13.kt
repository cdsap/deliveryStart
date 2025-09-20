package com.awesomeapp.sessioncart

sealed class State267_13 {
    data object Loading : State267_13()
    data class Success(val data: String) : State267_13()
    data class Error(val message: String) : State267_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}