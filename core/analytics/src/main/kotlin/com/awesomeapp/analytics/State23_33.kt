package com.awesomeapp.analytics

sealed class State23_33 {
    data object Loading : State23_33()
    data class Success(val data: String) : State23_33()
    data class Error(val message: String) : State23_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}