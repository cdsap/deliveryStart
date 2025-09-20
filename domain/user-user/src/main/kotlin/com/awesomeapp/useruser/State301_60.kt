package com.awesomeapp.useruser

sealed class State301_60 {
    data object Loading : State301_60()
    data class Success(val data: String) : State301_60()
    data class Error(val message: String) : State301_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}