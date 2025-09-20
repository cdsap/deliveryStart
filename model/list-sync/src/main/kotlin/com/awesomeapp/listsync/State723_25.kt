package com.awesomeapp.listsync

sealed class State723_25 {
    data object Loading : State723_25()
    data class Success(val data: String) : State723_25()
    data class Error(val message: String) : State723_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}