package com.awesomeapp.listcomment

sealed class State478_39 {
    data object Loading : State478_39()
    data class Success(val data: String) : State478_39()
    data class Error(val message: String) : State478_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}