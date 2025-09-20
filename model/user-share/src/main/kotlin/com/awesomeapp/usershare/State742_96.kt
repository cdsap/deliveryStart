package com.awesomeapp.usershare

sealed class State742_96 {
    data object Loading : State742_96()
    data class Success(val data: String) : State742_96()
    data class Error(val message: String) : State742_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}