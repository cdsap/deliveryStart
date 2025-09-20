package com.awesomeapp.contactprofile

sealed class State345_93 {
    data object Loading : State345_93()
    data class Success(val data: String) : State345_93()
    data class Error(val message: String) : State345_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}