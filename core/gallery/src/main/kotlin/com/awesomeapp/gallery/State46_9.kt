package com.awesomeapp.gallery

sealed class State46_9 {
    data object Loading : State46_9()
    data class Success(val data: String) : State46_9()
    data class Error(val message: String) : State46_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}