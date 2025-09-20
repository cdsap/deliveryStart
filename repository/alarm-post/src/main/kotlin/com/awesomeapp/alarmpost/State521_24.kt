package com.awesomeapp.alarmpost

sealed class State521_24 {
    data object Loading : State521_24()
    data class Success(val data: String) : State521_24()
    data class Error(val message: String) : State521_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}