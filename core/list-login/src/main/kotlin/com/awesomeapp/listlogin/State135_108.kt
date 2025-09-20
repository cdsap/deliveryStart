package com.awesomeapp.listlogin

sealed class State135_108 {
    data object Loading : State135_108()
    data class Success(val data: String) : State135_108()
    data class Error(val message: String) : State135_108()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}