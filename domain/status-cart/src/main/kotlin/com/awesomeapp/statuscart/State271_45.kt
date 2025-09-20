package com.awesomeapp.statuscart

sealed class State271_45 {
    data object Loading : State271_45()
    data class Success(val data: String) : State271_45()
    data class Error(val message: String) : State271_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}