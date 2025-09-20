package com.awesomeapp.photocontact

sealed class State94_21 {
    data object Loading : State94_21()
    data class Success(val data: String) : State94_21()
    data class Error(val message: String) : State94_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}