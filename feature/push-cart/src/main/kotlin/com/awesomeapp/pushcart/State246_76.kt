package com.awesomeapp.pushcart

sealed class State246_76 {
    data object Loading : State246_76()
    data class Success(val data: String) : State246_76()
    data class Error(val message: String) : State246_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}