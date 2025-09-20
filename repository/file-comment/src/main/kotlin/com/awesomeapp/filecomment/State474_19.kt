package com.awesomeapp.filecomment

sealed class State474_19 {
    data object Loading : State474_19()
    data class Success(val data: String) : State474_19()
    data class Error(val message: String) : State474_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}