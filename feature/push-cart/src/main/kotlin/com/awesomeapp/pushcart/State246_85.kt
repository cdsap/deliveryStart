package com.awesomeapp.pushcart

sealed class State246_85 {
    data object Loading : State246_85()
    data class Success(val data: String) : State246_85()
    data class Error(val message: String) : State246_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}