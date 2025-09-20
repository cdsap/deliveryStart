package com.awesomeapp.commentidentity

sealed class State157_84 {
    data object Loading : State157_84()
    data class Success(val data: String) : State157_84()
    data class Error(val message: String) : State157_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}