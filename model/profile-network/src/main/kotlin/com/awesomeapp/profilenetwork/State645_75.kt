package com.awesomeapp.profilenetwork

sealed class State645_75 {
    data object Loading : State645_75()
    data class Success(val data: String) : State645_75()
    data class Error(val message: String) : State645_75()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}