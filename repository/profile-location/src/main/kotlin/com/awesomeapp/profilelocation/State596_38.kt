package com.awesomeapp.profilelocation

sealed class State596_38 {
    data object Loading : State596_38()
    data class Success(val data: String) : State596_38()
    data class Error(val message: String) : State596_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}