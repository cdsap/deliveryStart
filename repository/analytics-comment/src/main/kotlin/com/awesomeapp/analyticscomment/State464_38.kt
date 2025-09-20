package com.awesomeapp.analyticscomment

sealed class State464_38 {
    data object Loading : State464_38()
    data class Success(val data: String) : State464_38()
    data class Error(val message: String) : State464_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}