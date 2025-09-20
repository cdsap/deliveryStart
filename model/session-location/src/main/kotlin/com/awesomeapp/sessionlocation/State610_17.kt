package com.awesomeapp.sessionlocation

sealed class State610_17 {
    data object Loading : State610_17()
    data class Success(val data: String) : State610_17()
    data class Error(val message: String) : State610_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}