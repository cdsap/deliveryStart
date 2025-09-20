package com.awesomeapp.podcastlocation

sealed class State631_45 {
    data object Loading : State631_45()
    data class Success(val data: String) : State631_45()
    data class Error(val message: String) : State631_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}