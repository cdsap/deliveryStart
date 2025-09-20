package com.awesomeapp.app

sealed class State751_69 {
    data object Loading : State751_69()
    data class Success(val data: String) : State751_69()
    data class Error(val message: String) : State751_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}