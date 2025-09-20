package com.awesomeapp.alarmcart

sealed class State276_15 {
    data object Loading : State276_15()
    data class Success(val data: String) : State276_15()
    data class Error(val message: String) : State276_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}