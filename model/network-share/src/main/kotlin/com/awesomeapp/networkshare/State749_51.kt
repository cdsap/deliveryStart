package com.awesomeapp.networkshare

sealed class State749_51 {
    data object Loading : State749_51()
    data class Success(val data: String) : State749_51()
    data class Error(val message: String) : State749_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}