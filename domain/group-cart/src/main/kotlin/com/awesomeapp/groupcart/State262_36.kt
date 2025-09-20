package com.awesomeapp.groupcart

sealed class State262_36 {
    data object Loading : State262_36()
    data class Success(val data: String) : State262_36()
    data class Error(val message: String) : State262_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}