package com.awesomeapp.contactprofile

sealed class State345_111 {
    data object Loading : State345_111()
    data class Success(val data: String) : State345_111()
    data class Error(val message: String) : State345_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}