package com.awesomeapp.contactcart

sealed class State247_42 {
    data object Loading : State247_42()
    data class Success(val data: String) : State247_42()
    data class Error(val message: String) : State247_42()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}