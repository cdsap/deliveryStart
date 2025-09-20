package com.awesomeapp.listsync

sealed class State723_22 {
    data object Loading : State723_22()
    data class Success(val data: String) : State723_22()
    data class Error(val message: String) : State723_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}