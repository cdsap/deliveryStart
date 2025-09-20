package com.awesomeapp.newslocation

sealed class State629_96 {
    data object Loading : State629_96()
    data class Success(val data: String) : State629_96()
    data class Error(val message: String) : State629_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}