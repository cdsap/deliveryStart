package com.awesomeapp.contactprofile

sealed class State345_87 {
    data object Loading : State345_87()
    data class Success(val data: String) : State345_87()
    data class Error(val message: String) : State345_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}