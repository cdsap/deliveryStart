package com.awesomeapp.reportuser

sealed class State318_40 {
    data object Loading : State318_40()
    data class Success(val data: String) : State318_40()
    data class Error(val message: String) : State318_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}