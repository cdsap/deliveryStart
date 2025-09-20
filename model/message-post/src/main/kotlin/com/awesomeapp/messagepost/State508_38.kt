package com.awesomeapp.messagepost

sealed class State508_38 {
    data object Loading : State508_38()
    data class Success(val data: String) : State508_38()
    data class Error(val message: String) : State508_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}