package com.awesomeapp.feedcart

sealed class State254_126 {
    data object Loading : State254_126()
    data class Success(val data: String) : State254_126()
    data class Error(val message: String) : State254_126()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}