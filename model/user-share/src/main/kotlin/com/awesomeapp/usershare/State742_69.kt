package com.awesomeapp.usershare

sealed class State742_69 {
    data object Loading : State742_69()
    data class Success(val data: String) : State742_69()
    data class Error(val message: String) : State742_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}