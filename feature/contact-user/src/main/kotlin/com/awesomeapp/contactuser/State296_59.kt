package com.awesomeapp.contactuser

sealed class State296_59 {
    data object Loading : State296_59()
    data class Success(val data: String) : State296_59()
    data class Error(val message: String) : State296_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}