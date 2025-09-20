package com.awesomeapp.listcomment

sealed class State478_27 {
    data object Loading : State478_27()
    data class Success(val data: String) : State478_27()
    data class Error(val message: String) : State478_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}