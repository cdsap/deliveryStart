package com.awesomeapp.newscheckout

sealed class State237_58 {
    data object Loading : State237_58()
    data class Success(val data: String) : State237_58()
    data class Error(val message: String) : State237_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}