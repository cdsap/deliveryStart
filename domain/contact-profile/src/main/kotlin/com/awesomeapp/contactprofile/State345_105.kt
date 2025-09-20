package com.awesomeapp.contactprofile

sealed class State345_105 {
    data object Loading : State345_105()
    data class Success(val data: String) : State345_105()
    data class Error(val message: String) : State345_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}