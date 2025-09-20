package com.awesomeapp.mappost

sealed class State528_21 {
    data object Loading : State528_21()
    data class Success(val data: String) : State528_21()
    data class Error(val message: String) : State528_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}