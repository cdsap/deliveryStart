package com.awesomeapp.settingsync

sealed class State706_111 {
    data object Loading : State706_111()
    data class Success(val data: String) : State706_111()
    data class Error(val message: String) : State706_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}