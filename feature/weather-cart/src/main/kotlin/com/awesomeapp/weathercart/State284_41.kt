package com.awesomeapp.weathercart

sealed class State284_41 {
    data object Loading : State284_41()
    data class Success(val data: String) : State284_41()
    data class Error(val message: String) : State284_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}