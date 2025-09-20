package com.awesomeapp.documentfeed

sealed class State426_61 {
    data object Loading : State426_61()
    data class Success(val data: String) : State426_61()
    data class Error(val message: String) : State426_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}