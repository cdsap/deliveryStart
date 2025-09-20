package com.awesomeapp.timersync

sealed class State718_144 {
    data object Loading : State718_144()
    data class Success(val data: String) : State718_144()
    data class Error(val message: String) : State718_144()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}