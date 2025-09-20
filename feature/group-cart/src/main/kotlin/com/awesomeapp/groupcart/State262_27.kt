package com.awesomeapp.groupcart

sealed class State262_27 {
    data object Loading : State262_27()
    data class Success(val data: String) : State262_27()
    data class Error(val message: String) : State262_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}