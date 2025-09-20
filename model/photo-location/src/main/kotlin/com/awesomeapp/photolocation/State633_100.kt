package com.awesomeapp.photolocation

sealed class State633_100 {
    data object Loading : State633_100()
    data class Success(val data: String) : State633_100()
    data class Error(val message: String) : State633_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}