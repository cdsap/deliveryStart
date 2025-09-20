package com.awesomeapp.podcastlocation

sealed class State631_111 {
    data object Loading : State631_111()
    data class Success(val data: String) : State631_111()
    data class Error(val message: String) : State631_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}