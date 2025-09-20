package com.awesomeapp.statusfeed

sealed class State418_102 {
    data object Loading : State418_102()
    data class Success(val data: String) : State418_102()
    data class Error(val message: String) : State418_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}