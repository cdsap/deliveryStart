package com.awesomeapp.accountidentity

sealed class State168_60 {
    data object Loading : State168_60()
    data class Success(val data: String) : State168_60()
    data class Error(val message: String) : State168_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}