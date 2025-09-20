package com.awesomeapp.sessionlogin

sealed class State120_32 {
    data object Loading : State120_32()
    data class Success(val data: String) : State120_32()
    data class Error(val message: String) : State120_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}