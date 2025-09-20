package com.awesomeapp.reportcomment

sealed class State465_114 {
    data object Loading : State465_114()
    data class Success(val data: String) : State465_114()
    data class Error(val message: String) : State465_114()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}