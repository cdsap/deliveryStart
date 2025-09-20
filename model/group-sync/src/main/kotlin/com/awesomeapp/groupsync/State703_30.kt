package com.awesomeapp.groupsync

sealed class State703_30 {
    data object Loading : State703_30()
    data class Success(val data: String) : State703_30()
    data class Error(val message: String) : State703_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}