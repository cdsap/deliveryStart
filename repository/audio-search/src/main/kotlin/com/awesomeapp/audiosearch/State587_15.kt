package com.awesomeapp.audiosearch

sealed class State587_15 {
    data object Loading : State587_15()
    data class Success(val data: String) : State587_15()
    data class Error(val message: String) : State587_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}