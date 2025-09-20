package com.awesomeapp.settingsync

sealed class State706_87 {
    data object Loading : State706_87()
    data class Success(val data: String) : State706_87()
    data class Error(val message: String) : State706_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}