package com.awesomeapp.reportuser

sealed class State318_118 {
    data object Loading : State318_118()
    data class Success(val data: String) : State318_118()
    data class Error(val message: String) : State318_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}