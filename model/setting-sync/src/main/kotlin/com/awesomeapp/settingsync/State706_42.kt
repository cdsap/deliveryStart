package com.awesomeapp.settingsync

sealed class State706_42 {
    data object Loading : State706_42()
    data class Success(val data: String) : State706_42()
    data class Error(val message: String) : State706_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}