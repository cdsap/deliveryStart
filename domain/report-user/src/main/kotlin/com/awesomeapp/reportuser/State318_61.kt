package com.awesomeapp.reportuser

sealed class State318_61 {
    data object Loading : State318_61()
    data class Success(val data: String) : State318_61()
    data class Error(val message: String) : State318_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}