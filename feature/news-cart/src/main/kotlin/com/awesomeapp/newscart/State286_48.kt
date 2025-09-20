package com.awesomeapp.newscart

sealed class State286_48 {
    data object Loading : State286_48()
    data class Success(val data: String) : State286_48()
    data class Error(val message: String) : State286_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}