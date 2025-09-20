package com.awesomeapp.timerlogin

sealed class State130_83 {
    data object Loading : State130_83()
    data class Success(val data: String) : State130_83()
    data class Error(val message: String) : State130_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}