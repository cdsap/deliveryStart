package com.awesomeapp.analyticslogin

sealed class State121_78 {
    data object Loading : State121_78()
    data class Success(val data: String) : State121_78()
    data class Error(val message: String) : State121_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}