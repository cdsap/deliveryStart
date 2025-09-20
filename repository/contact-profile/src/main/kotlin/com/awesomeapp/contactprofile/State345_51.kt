package com.awesomeapp.contactprofile

sealed class State345_51 {
    data object Loading : State345_51()
    data class Success(val data: String) : State345_51()
    data class Error(val message: String) : State345_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}