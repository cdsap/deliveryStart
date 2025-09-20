package com.awesomeapp.logcontact

sealed class State74_51 {
    data object Loading : State74_51()
    data class Success(val data: String) : State74_51()
    data class Error(val message: String) : State74_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}