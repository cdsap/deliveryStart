package com.awesomeapp.userfeed

sealed class State399_55 {
    data object Loading : State399_55()
    data class Success(val data: String) : State399_55()
    data class Error(val message: String) : State399_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}