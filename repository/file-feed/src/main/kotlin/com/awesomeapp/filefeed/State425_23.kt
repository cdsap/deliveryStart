package com.awesomeapp.filefeed

sealed class State425_23 {
    data object Loading : State425_23()
    data class Success(val data: String) : State425_23()
    data class Error(val message: String) : State425_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}