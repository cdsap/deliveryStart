package com.awesomeapp.photolocation

sealed class State633_76 {
    data object Loading : State633_76()
    data class Success(val data: String) : State633_76()
    data class Error(val message: String) : State633_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}