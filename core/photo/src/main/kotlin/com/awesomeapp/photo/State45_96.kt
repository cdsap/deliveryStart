package com.awesomeapp.photo

sealed class State45_96 {
    data object Loading : State45_96()
    data class Success(val data: String) : State45_96()
    data class Error(val message: String) : State45_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}