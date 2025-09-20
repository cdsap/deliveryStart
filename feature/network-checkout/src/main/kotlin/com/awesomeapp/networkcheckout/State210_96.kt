package com.awesomeapp.networkcheckout

sealed class State210_96 {
    data object Loading : State210_96()
    data class Success(val data: String) : State210_96()
    data class Error(val message: String) : State210_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}