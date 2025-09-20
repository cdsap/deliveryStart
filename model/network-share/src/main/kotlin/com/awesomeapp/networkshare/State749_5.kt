package com.awesomeapp.networkshare

sealed class State749_5 {
    data object Loading : State749_5()
    data class Success(val data: String) : State749_5()
    data class Error(val message: String) : State749_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}