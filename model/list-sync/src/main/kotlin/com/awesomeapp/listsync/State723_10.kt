package com.awesomeapp.listsync

sealed class State723_10 {
    data object Loading : State723_10()
    data class Success(val data: String) : State723_10()
    data class Error(val message: String) : State723_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}