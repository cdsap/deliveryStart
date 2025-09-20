package com.awesomeapp.group

sealed class State17_18 {
    data object Loading : State17_18()
    data class Success(val data: String) : State17_18()
    data class Error(val message: String) : State17_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}