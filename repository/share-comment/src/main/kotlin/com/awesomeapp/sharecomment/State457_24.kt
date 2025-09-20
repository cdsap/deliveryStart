package com.awesomeapp.sharecomment

sealed class State457_24 {
    data object Loading : State457_24()
    data class Success(val data: String) : State457_24()
    data class Error(val message: String) : State457_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}