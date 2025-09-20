package com.awesomeapp.timeruser

sealed class State326_27 {
    data object Loading : State326_27()
    data class Success(val data: String) : State326_27()
    data class Error(val message: String) : State326_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}