package com.awesomeapp.listsync

sealed class State723_91 {
    data object Loading : State723_91()
    data class Success(val data: String) : State723_91()
    data class Error(val message: String) : State723_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}