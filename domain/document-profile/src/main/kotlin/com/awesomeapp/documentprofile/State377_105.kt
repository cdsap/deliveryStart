package com.awesomeapp.documentprofile

sealed class State377_105 {
    data object Loading : State377_105()
    data class Success(val data: String) : State377_105()
    data class Error(val message: String) : State377_105()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}