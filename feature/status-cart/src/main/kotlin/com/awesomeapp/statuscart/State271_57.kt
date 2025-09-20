package com.awesomeapp.statuscart

sealed class State271_57 {
    data object Loading : State271_57()
    data class Success(val data: String) : State271_57()
    data class Error(val message: String) : State271_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}