package com.awesomeapp.groupcart

sealed class State262_51 {
    data object Loading : State262_51()
    data class Success(val data: String) : State262_51()
    data class Error(val message: String) : State262_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}