package com.awesomeapp.articleprofile

sealed class State385_80 {
    data object Loading : State385_80()
    data class Success(val data: String) : State385_80()
    data class Error(val message: String) : State385_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}