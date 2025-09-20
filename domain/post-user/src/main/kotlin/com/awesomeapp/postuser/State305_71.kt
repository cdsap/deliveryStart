package com.awesomeapp.postuser

sealed class State305_71 {
    data object Loading : State305_71()
    data class Success(val data: String) : State305_71()
    data class Error(val message: String) : State305_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}