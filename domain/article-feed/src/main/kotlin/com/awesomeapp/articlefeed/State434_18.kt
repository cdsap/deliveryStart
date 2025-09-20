package com.awesomeapp.articlefeed

sealed class State434_18 {
    data object Loading : State434_18()
    data class Success(val data: String) : State434_18()
    data class Error(val message: String) : State434_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}