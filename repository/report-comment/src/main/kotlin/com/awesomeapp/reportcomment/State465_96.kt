package com.awesomeapp.reportcomment

sealed class State465_96 {
    data object Loading : State465_96()
    data class Success(val data: String) : State465_96()
    data class Error(val message: String) : State465_96()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}