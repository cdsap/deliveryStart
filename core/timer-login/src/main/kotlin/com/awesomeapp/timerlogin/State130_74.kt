package com.awesomeapp.timerlogin

sealed class State130_74 {
    data object Loading : State130_74()
    data class Success(val data: String) : State130_74()
    data class Error(val message: String) : State130_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}