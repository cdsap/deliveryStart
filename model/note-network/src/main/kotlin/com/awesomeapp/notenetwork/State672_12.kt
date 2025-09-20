package com.awesomeapp.notenetwork

sealed class State672_12 {
    data object Loading : State672_12()
    data class Success(val data: String) : State672_12()
    data class Error(val message: String) : State672_12()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}