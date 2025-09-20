package com.awesomeapp.settingfeed

sealed class State412_116 {
    data object Loading : State412_116()
    data class Success(val data: String) : State412_116()
    data class Error(val message: String) : State412_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}