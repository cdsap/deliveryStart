package com.awesomeapp.documentcart

sealed class State279_34 {
    data object Loading : State279_34()
    data class Success(val data: String) : State279_34()
    data class Error(val message: String) : State279_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}