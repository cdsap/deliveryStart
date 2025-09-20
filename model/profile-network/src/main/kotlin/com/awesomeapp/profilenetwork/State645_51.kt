package com.awesomeapp.profilenetwork

sealed class State645_51 {
    data object Loading : State645_51()
    data class Success(val data: String) : State645_51()
    data class Error(val message: String) : State645_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}