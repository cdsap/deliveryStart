package com.awesomeapp.account

sealed class State21_19 {
    data object Loading : State21_19()
    data class Success(val data: String) : State21_19()
    data class Error(val message: String) : State21_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}