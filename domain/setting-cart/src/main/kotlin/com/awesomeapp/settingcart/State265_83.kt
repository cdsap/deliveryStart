package com.awesomeapp.settingcart

sealed class State265_83 {
    data object Loading : State265_83()
    data class Success(val data: String) : State265_83()
    data class Error(val message: String) : State265_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}