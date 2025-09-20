package com.awesomeapp.videonetwork

sealed class State681_49 {
    data object Loading : State681_49()
    data class Success(val data: String) : State681_49()
    data class Error(val message: String) : State681_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}