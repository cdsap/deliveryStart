package com.awesomeapp.identitycheckout

sealed class State200_25 {
    data object Loading : State200_25()
    data class Success(val data: String) : State200_25()
    data class Error(val message: String) : State200_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}