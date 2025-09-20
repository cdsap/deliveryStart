package com.awesomeapp.timersync

sealed class State718_120 {
    data object Loading : State718_120()
    data class Success(val data: String) : State718_120()
    data class Error(val message: String) : State718_120()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}