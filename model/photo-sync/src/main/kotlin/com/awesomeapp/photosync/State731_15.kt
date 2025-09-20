package com.awesomeapp.photosync

sealed class State731_15 {
    data object Loading : State731_15()
    data class Success(val data: String) : State731_15()
    data class Error(val message: String) : State731_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}