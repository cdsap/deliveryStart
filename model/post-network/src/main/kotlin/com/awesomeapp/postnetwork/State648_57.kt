package com.awesomeapp.postnetwork

sealed class State648_57 {
    data object Loading : State648_57()
    data class Success(val data: String) : State648_57()
    data class Error(val message: String) : State648_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}