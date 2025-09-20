package com.awesomeapp.timerlogin

sealed class State130_77 {
    data object Loading : State130_77()
    data class Success(val data: String) : State130_77()
    data class Error(val message: String) : State130_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}