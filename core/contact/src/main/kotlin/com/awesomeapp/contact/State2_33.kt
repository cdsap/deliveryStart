package com.awesomeapp.contact

sealed class State2_33 {
    data object Loading : State2_33()
    data class Success(val data: String) : State2_33()
    data class Error(val message: String) : State2_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}