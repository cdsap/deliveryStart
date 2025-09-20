package com.awesomeapp.statuscart

sealed class State271_27 {
    data object Loading : State271_27()
    data class Success(val data: String) : State271_27()
    data class Error(val message: String) : State271_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}