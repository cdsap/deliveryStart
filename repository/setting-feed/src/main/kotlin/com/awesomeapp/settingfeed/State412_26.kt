package com.awesomeapp.settingfeed

sealed class State412_26 {
    data object Loading : State412_26()
    data class Success(val data: String) : State412_26()
    data class Error(val message: String) : State412_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}