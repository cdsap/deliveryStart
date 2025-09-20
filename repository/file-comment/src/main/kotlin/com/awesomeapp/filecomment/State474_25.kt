package com.awesomeapp.filecomment

sealed class State474_25 {
    data object Loading : State474_25()
    data class Success(val data: String) : State474_25()
    data class Error(val message: String) : State474_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}