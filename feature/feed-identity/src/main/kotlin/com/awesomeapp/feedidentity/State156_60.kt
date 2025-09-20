package com.awesomeapp.feedidentity

sealed class State156_60 {
    data object Loading : State156_60()
    data class Success(val data: String) : State156_60()
    data class Error(val message: String) : State156_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}