package com.awesomeapp.postnetwork

sealed class State648_78 {
    data object Loading : State648_78()
    data class Success(val data: String) : State648_78()
    data class Error(val message: String) : State648_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}