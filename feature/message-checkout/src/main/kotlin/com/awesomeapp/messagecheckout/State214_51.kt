package com.awesomeapp.messagecheckout

sealed class State214_51 {
    data object Loading : State214_51()
    data class Success(val data: String) : State214_51()
    data class Error(val message: String) : State214_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}