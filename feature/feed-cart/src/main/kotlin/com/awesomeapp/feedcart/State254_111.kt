package com.awesomeapp.feedcart

sealed class State254_111 {
    data object Loading : State254_111()
    data class Success(val data: String) : State254_111()
    data class Error(val message: String) : State254_111()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}