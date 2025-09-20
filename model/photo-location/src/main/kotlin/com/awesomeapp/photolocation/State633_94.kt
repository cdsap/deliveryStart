package com.awesomeapp.photolocation

sealed class State633_94 {
    data object Loading : State633_94()
    data class Success(val data: String) : State633_94()
    data class Error(val message: String) : State633_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}