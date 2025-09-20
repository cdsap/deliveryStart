package com.awesomeapp.accountprofile

sealed class State364_104 {
    data object Loading : State364_104()
    data class Success(val data: String) : State364_104()
    data class Error(val message: String) : State364_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}