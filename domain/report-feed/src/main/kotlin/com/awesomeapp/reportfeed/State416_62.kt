package com.awesomeapp.reportfeed

sealed class State416_62 {
    data object Loading : State416_62()
    data class Success(val data: String) : State416_62()
    data class Error(val message: String) : State416_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}