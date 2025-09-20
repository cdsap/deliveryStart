package com.awesomeapp.photosync

sealed class State731_9 {
    data object Loading : State731_9()
    data class Success(val data: String) : State731_9()
    data class Error(val message: String) : State731_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}