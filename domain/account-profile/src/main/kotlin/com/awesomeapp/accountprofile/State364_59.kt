package com.awesomeapp.accountprofile

sealed class State364_59 {
    data object Loading : State364_59()
    data class Success(val data: String) : State364_59()
    data class Error(val message: String) : State364_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}