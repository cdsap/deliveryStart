package com.awesomeapp.cartnetwork

sealed class State643_60 {
    data object Loading : State643_60()
    data class Success(val data: String) : State643_60()
    data class Error(val message: String) : State643_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}