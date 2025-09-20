package com.awesomeapp.articlefeed

sealed class State434_120 {
    data object Loading : State434_120()
    data class Success(val data: String) : State434_120()
    data class Error(val message: String) : State434_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}