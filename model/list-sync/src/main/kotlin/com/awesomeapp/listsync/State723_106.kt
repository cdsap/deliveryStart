package com.awesomeapp.listsync

sealed class State723_106 {
    data object Loading : State723_106()
    data class Success(val data: String) : State723_106()
    data class Error(val message: String) : State723_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}