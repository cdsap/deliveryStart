package com.awesomeapp.profilefeed

sealed class State400_55 {
    data object Loading : State400_55()
    data class Success(val data: String) : State400_55()
    data class Error(val message: String) : State400_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}