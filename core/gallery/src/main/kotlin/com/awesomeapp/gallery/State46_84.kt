package com.awesomeapp.gallery

sealed class State46_84 {
    data object Loading : State46_84()
    data class Success(val data: String) : State46_84()
    data class Error(val message: String) : State46_84()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}