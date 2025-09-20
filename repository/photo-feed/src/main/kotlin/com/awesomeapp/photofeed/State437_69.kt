package com.awesomeapp.photofeed

sealed class State437_69 {
    data object Loading : State437_69()
    data class Success(val data: String) : State437_69()
    data class Error(val message: String) : State437_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}