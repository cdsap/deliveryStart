package com.awesomeapp.logpost

sealed class State515_47 {
    data object Loading : State515_47()
    data class Success(val data: String) : State515_47()
    data class Error(val message: String) : State515_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}