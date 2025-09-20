package com.awesomeapp.groupsync

sealed class State703_63 {
    data object Loading : State703_63()
    data class Success(val data: String) : State703_63()
    data class Error(val message: String) : State703_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}