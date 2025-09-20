package com.awesomeapp.analyticslogin

sealed class State121_54 {
    data object Loading : State121_54()
    data class Success(val data: String) : State121_54()
    data class Error(val message: String) : State121_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}