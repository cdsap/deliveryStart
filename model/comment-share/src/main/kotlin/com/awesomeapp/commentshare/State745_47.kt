package com.awesomeapp.commentshare

sealed class State745_47 {
    data object Loading : State745_47()
    data class Success(val data: String) : State745_47()
    data class Error(val message: String) : State745_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}