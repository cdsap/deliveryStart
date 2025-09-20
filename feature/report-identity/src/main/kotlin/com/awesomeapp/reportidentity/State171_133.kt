package com.awesomeapp.reportidentity

sealed class State171_133 {
    data object Loading : State171_133()
    data class Success(val data: String) : State171_133()
    data class Error(val message: String) : State171_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}