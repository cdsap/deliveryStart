package com.awesomeapp.videouser

sealed class State338_96 {
    data object Loading : State338_96()
    data class Success(val data: String) : State338_96()
    data class Error(val message: String) : State338_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}