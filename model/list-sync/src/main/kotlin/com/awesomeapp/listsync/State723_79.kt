package com.awesomeapp.listsync

sealed class State723_79 {
    data object Loading : State723_79()
    data class Success(val data: String) : State723_79()
    data class Error(val message: String) : State723_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}