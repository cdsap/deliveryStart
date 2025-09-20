package com.awesomeapp.contactuser

sealed class State296_104 {
    data object Loading : State296_104()
    data class Success(val data: String) : State296_104()
    data class Error(val message: String) : State296_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}