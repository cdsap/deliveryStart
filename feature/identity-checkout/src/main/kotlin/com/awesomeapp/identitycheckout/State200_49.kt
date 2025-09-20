package com.awesomeapp.identitycheckout

sealed class State200_49 {
    data object Loading : State200_49()
    data class Success(val data: String) : State200_49()
    data class Error(val message: String) : State200_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}