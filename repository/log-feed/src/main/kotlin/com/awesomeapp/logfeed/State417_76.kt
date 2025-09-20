package com.awesomeapp.logfeed

sealed class State417_76 {
    data object Loading : State417_76()
    data class Success(val data: String) : State417_76()
    data class Error(val message: String) : State417_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}