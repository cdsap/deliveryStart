package com.awesomeapp.videonetwork

sealed class State681_16 {
    data object Loading : State681_16()
    data class Success(val data: String) : State681_16()
    data class Error(val message: String) : State681_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}