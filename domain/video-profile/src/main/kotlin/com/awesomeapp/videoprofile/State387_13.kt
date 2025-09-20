package com.awesomeapp.videoprofile

sealed class State387_13 {
    data object Loading : State387_13()
    data class Success(val data: String) : State387_13()
    data class Error(val message: String) : State387_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}