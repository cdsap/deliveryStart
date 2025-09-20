package com.awesomeapp.contactpost

sealed class State492_51 {
    data object Loading : State492_51()
    data class Success(val data: String) : State492_51()
    data class Error(val message: String) : State492_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}