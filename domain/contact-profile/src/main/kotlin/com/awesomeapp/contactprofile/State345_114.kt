package com.awesomeapp.contactprofile

sealed class State345_114 {
    data object Loading : State345_114()
    data class Success(val data: String) : State345_114()
    data class Error(val message: String) : State345_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}