package com.awesomeapp.contactuser

sealed class State296_44 {
    data object Loading : State296_44()
    data class Success(val data: String) : State296_44()
    data class Error(val message: String) : State296_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}