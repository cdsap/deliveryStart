package com.awesomeapp.listsync

sealed class State723_97 {
    data object Loading : State723_97()
    data class Success(val data: String) : State723_97()
    data class Error(val message: String) : State723_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}