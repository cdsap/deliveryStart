package com.awesomeapp.playlistidentity

sealed class State196_38 {
    data object Loading : State196_38()
    data class Success(val data: String) : State196_38()
    data class Error(val message: String) : State196_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}