package com.awesomeapp.sharesearch

sealed class State555_21 {
    data object Loading : State555_21()
    data class Success(val data: String) : State555_21()
    data class Error(val message: String) : State555_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}