package com.awesomeapp.contactuser

sealed class State296_98 {
    data object Loading : State296_98()
    data class Success(val data: String) : State296_98()
    data class Error(val message: String) : State296_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}