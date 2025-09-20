package com.awesomeapp.analyticsidentity

sealed class State170_47 {
    data object Loading : State170_47()
    data class Success(val data: String) : State170_47()
    data class Error(val message: String) : State170_47()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}