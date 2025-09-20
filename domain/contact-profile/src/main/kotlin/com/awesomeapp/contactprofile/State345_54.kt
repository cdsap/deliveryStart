package com.awesomeapp.contactprofile

sealed class State345_54 {
    data object Loading : State345_54()
    data class Success(val data: String) : State345_54()
    data class Error(val message: String) : State345_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}