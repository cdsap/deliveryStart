package com.awesomeapp.videonetwork

sealed class State681_61 {
    data object Loading : State681_61()
    data class Success(val data: String) : State681_61()
    data class Error(val message: String) : State681_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}