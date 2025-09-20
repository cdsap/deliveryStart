package com.awesomeapp.shareprofile

sealed class State359_48 {
    data object Loading : State359_48()
    data class Success(val data: String) : State359_48()
    data class Error(val message: String) : State359_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}