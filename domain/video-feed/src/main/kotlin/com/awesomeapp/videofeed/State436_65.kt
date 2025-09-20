package com.awesomeapp.videofeed

sealed class State436_65 {
    data object Loading : State436_65()
    data class Success(val data: String) : State436_65()
    data class Error(val message: String) : State436_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}