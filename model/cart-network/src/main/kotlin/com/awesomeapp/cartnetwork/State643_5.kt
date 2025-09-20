package com.awesomeapp.cartnetwork

sealed class State643_5 {
    data object Loading : State643_5()
    data class Success(val data: String) : State643_5()
    data class Error(val message: String) : State643_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}