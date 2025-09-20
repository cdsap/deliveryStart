package com.awesomeapp.groupsync

sealed class State703_51 {
    data object Loading : State703_51()
    data class Success(val data: String) : State703_51()
    data class Error(val message: String) : State703_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}