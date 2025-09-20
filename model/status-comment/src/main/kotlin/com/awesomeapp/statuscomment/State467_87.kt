package com.awesomeapp.statuscomment

sealed class State467_87 {
    data object Loading : State467_87()
    data class Success(val data: String) : State467_87()
    data class Error(val message: String) : State467_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}