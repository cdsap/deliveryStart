package com.awesomeapp.contactpost

sealed class State492_39 {
    data object Loading : State492_39()
    data class Success(val data: String) : State492_39()
    data class Error(val message: String) : State492_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}