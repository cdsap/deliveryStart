package com.awesomeapp.articleprofile

sealed class State385_59 {
    data object Loading : State385_59()
    data class Success(val data: String) : State385_59()
    data class Error(val message: String) : State385_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}