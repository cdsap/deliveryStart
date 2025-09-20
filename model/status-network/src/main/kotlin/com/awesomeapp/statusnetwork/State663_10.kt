package com.awesomeapp.statusnetwork

sealed class State663_10 {
    data object Loading : State663_10()
    data class Success(val data: String) : State663_10()
    data class Error(val message: String) : State663_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}