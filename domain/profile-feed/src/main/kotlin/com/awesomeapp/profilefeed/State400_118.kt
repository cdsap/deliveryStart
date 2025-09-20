package com.awesomeapp.profilefeed

sealed class State400_118 {
    data object Loading : State400_118()
    data class Success(val data: String) : State400_118()
    data class Error(val message: String) : State400_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}