package com.awesomeapp.userfeed

sealed class State399_16 {
    data object Loading : State399_16()
    data class Success(val data: String) : State399_16()
    data class Error(val message: String) : State399_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}