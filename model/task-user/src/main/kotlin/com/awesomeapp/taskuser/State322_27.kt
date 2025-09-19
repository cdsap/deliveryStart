package com.awesomeapp.taskuser

sealed class State322_27 {
    data object Loading : State322_27()
    data class Success(val data: String) : State322_27()
    data class Error(val message: String) : State322_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}