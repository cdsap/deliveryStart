package com.awesomeapp.usercomment

sealed class State448_35 {
    data object Loading : State448_35()
    data class Success(val data: String) : State448_35()
    data class Error(val message: String) : State448_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}