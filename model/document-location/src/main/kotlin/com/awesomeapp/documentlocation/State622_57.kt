package com.awesomeapp.documentlocation

sealed class State622_57 {
    data object Loading : State622_57()
    data class Success(val data: String) : State622_57()
    data class Error(val message: String) : State622_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}