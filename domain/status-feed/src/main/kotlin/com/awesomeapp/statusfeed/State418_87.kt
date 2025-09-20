package com.awesomeapp.statusfeed

sealed class State418_87 {
    data object Loading : State418_87()
    data class Success(val data: String) : State418_87()
    data class Error(val message: String) : State418_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}