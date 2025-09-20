package com.awesomeapp.photolocation

sealed class State633_103 {
    data object Loading : State633_103()
    data class Success(val data: String) : State633_103()
    data class Error(val message: String) : State633_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}