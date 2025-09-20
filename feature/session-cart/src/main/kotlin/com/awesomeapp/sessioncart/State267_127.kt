package com.awesomeapp.sessioncart

sealed class State267_127 {
    data object Loading : State267_127()
    data class Success(val data: String) : State267_127()
    data class Error(val message: String) : State267_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}