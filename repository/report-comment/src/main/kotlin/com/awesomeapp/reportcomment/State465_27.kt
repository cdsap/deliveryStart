package com.awesomeapp.reportcomment

sealed class State465_27 {
    data object Loading : State465_27()
    data class Success(val data: String) : State465_27()
    data class Error(val message: String) : State465_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}