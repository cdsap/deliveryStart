package com.awesomeapp.reportcomment

sealed class State465_60 {
    data object Loading : State465_60()
    data class Success(val data: String) : State465_60()
    data class Error(val message: String) : State465_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}