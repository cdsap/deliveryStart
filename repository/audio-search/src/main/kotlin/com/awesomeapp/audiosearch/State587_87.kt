package com.awesomeapp.audiosearch

sealed class State587_87 {
    data object Loading : State587_87()
    data class Success(val data: String) : State587_87()
    data class Error(val message: String) : State587_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}