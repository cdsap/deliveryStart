package com.awesomeapp.taskprofile

sealed class State371_144 {
    data object Loading : State371_144()
    data class Success(val data: String) : State371_144()
    data class Error(val message: String) : State371_144()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}