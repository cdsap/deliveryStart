package com.awesomeapp.statussync

sealed class State712_59 {
    data object Loading : State712_59()
    data class Success(val data: String) : State712_59()
    data class Error(val message: String) : State712_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}