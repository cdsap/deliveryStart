package com.awesomeapp.statusnetwork

sealed class State663_43 {
    data object Loading : State663_43()
    data class Success(val data: String) : State663_43()
    data class Error(val message: String) : State663_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}