package com.awesomeapp.newscheckout

sealed class State237_79 {
    data object Loading : State237_79()
    data class Success(val data: String) : State237_79()
    data class Error(val message: String) : State237_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}