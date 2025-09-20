package com.awesomeapp.articlefeed

sealed class State434_72 {
    data object Loading : State434_72()
    data class Success(val data: String) : State434_72()
    data class Error(val message: String) : State434_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}