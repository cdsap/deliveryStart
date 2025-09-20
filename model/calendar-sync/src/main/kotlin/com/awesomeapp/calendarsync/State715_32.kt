package com.awesomeapp.calendarsync

sealed class State715_32 {
    data object Loading : State715_32()
    data class Success(val data: String) : State715_32()
    data class Error(val message: String) : State715_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}