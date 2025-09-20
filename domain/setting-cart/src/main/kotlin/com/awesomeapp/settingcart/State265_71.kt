package com.awesomeapp.settingcart

sealed class State265_71 {
    data object Loading : State265_71()
    data class Success(val data: String) : State265_71()
    data class Error(val message: String) : State265_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}