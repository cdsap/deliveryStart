package com.awesomeapp.cartnetwork

sealed class State643_48 {
    data object Loading : State643_48()
    data class Success(val data: String) : State643_48()
    data class Error(val message: String) : State643_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}