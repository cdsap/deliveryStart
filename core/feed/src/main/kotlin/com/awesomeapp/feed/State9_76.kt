package com.awesomeapp.feed

sealed class State9_76 {
    data object Loading : State9_76()
    data class Success(val data: String) : State9_76()
    data class Error(val message: String) : State9_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}