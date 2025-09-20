package com.awesomeapp.profilefeed

sealed class State400_64 {
    data object Loading : State400_64()
    data class Success(val data: String) : State400_64()
    data class Error(val message: String) : State400_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}