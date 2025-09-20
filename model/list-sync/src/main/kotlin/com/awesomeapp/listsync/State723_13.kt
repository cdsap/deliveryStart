package com.awesomeapp.listsync

sealed class State723_13 {
    data object Loading : State723_13()
    data class Success(val data: String) : State723_13()
    data class Error(val message: String) : State723_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}