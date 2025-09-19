package com.awesomeapp.commentuser

sealed class State304_17 {
    data object Loading : State304_17()
    data class Success(val data: String) : State304_17()
    data class Error(val message: String) : State304_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}