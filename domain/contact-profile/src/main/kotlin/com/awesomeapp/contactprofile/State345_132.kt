package com.awesomeapp.contactprofile

sealed class State345_132 {
    data object Loading : State345_132()
    data class Success(val data: String) : State345_132()
    data class Error(val message: String) : State345_132()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}