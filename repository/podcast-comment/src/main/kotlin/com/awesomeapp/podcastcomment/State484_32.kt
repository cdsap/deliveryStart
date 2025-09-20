package com.awesomeapp.podcastcomment

sealed class State484_32 {
    data object Loading : State484_32()
    data class Success(val data: String) : State484_32()
    data class Error(val message: String) : State484_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}