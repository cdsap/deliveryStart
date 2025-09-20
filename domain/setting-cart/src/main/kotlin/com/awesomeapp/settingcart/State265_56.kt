package com.awesomeapp.settingcart

sealed class State265_56 {
    data object Loading : State265_56()
    data class Success(val data: String) : State265_56()
    data class Error(val message: String) : State265_56()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}