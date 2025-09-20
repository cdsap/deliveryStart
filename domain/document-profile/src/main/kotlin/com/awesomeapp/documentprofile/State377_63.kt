package com.awesomeapp.documentprofile

sealed class State377_63 {
    data object Loading : State377_63()
    data class Success(val data: String) : State377_63()
    data class Error(val message: String) : State377_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}