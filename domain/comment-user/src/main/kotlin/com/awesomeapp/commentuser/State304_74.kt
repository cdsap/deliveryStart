package com.awesomeapp.commentuser

sealed class State304_74 {
    data object Loading : State304_74()
    data class Success(val data: String) : State304_74()
    data class Error(val message: String) : State304_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}