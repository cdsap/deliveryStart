package com.awesomeapp.photofeed

sealed class State437_30 {
    data object Loading : State437_30()
    data class Success(val data: String) : State437_30()
    data class Error(val message: String) : State437_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}