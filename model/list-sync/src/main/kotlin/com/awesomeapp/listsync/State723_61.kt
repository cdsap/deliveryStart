package com.awesomeapp.listsync

sealed class State723_61 {
    data object Loading : State723_61()
    data class Success(val data: String) : State723_61()
    data class Error(val message: String) : State723_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}