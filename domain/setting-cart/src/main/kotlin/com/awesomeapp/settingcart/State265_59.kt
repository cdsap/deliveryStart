package com.awesomeapp.settingcart

sealed class State265_59 {
    data object Loading : State265_59()
    data class Success(val data: String) : State265_59()
    data class Error(val message: String) : State265_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}