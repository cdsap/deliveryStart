package com.awesomeapp.messagecheckout

sealed class State214_45 {
    data object Loading : State214_45()
    data class Success(val data: String) : State214_45()
    data class Error(val message: String) : State214_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}