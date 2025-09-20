package com.awesomeapp.todoprofile

sealed class State379_96 {
    data object Loading : State379_96()
    data class Success(val data: String) : State379_96()
    data class Error(val message: String) : State379_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}