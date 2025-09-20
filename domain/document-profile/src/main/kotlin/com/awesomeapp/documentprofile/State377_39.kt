package com.awesomeapp.documentprofile

sealed class State377_39 {
    data object Loading : State377_39()
    data class Success(val data: String) : State377_39()
    data class Error(val message: String) : State377_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}