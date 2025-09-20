package com.awesomeapp.newsidentity

sealed class State188_62 {
    data object Loading : State188_62()
    data class Success(val data: String) : State188_62()
    data class Error(val message: String) : State188_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}