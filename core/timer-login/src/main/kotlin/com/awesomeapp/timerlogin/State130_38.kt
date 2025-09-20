package com.awesomeapp.timerlogin

sealed class State130_38 {
    data object Loading : State130_38()
    data class Success(val data: String) : State130_38()
    data class Error(val message: String) : State130_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}