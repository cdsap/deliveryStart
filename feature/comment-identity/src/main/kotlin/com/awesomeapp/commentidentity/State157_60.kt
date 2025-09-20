package com.awesomeapp.commentidentity

sealed class State157_60 {
    data object Loading : State157_60()
    data class Success(val data: String) : State157_60()
    data class Error(val message: String) : State157_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}