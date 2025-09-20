package com.awesomeapp.photolocation

sealed class State633_127 {
    data object Loading : State633_127()
    data class Success(val data: String) : State633_127()
    data class Error(val message: String) : State633_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}