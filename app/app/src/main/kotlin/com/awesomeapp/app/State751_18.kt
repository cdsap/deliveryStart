package com.awesomeapp.app

sealed class State751_18 {
    data object Loading : State751_18()
    data class Success(val data: String) : State751_18()
    data class Error(val message: String) : State751_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}