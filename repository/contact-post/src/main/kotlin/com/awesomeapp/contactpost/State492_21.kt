package com.awesomeapp.contactpost

sealed class State492_21 {
    data object Loading : State492_21()
    data class Success(val data: String) : State492_21()
    data class Error(val message: String) : State492_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}