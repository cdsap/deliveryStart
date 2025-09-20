package com.awesomeapp.statusfeed

sealed class State418_57 {
    data object Loading : State418_57()
    data class Success(val data: String) : State418_57()
    data class Error(val message: String) : State418_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}