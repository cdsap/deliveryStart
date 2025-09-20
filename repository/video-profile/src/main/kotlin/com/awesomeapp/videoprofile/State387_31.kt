package com.awesomeapp.videoprofile

sealed class State387_31 {
    data object Loading : State387_31()
    data class Success(val data: String) : State387_31()
    data class Error(val message: String) : State387_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}