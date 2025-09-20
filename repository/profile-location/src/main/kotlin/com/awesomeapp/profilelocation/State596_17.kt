package com.awesomeapp.profilelocation

sealed class State596_17 {
    data object Loading : State596_17()
    data class Success(val data: String) : State596_17()
    data class Error(val message: String) : State596_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}