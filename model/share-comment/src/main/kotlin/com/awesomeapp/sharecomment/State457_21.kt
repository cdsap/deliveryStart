package com.awesomeapp.sharecomment

sealed class State457_21 {
    data object Loading : State457_21()
    data class Success(val data: String) : State457_21()
    data class Error(val message: String) : State457_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}