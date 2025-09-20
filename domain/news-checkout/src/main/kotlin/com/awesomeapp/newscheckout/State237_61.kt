package com.awesomeapp.newscheckout

sealed class State237_61 {
    data object Loading : State237_61()
    data class Success(val data: String) : State237_61()
    data class Error(val message: String) : State237_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}