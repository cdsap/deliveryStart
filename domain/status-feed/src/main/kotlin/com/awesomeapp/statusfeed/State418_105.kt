package com.awesomeapp.statusfeed

sealed class State418_105 {
    data object Loading : State418_105()
    data class Success(val data: String) : State418_105()
    data class Error(val message: String) : State418_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}