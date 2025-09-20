package com.awesomeapp.feedidentity

sealed class State156_63 {
    data object Loading : State156_63()
    data class Success(val data: String) : State156_63()
    data class Error(val message: String) : State156_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}