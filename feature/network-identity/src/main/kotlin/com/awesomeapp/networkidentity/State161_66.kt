package com.awesomeapp.networkidentity

sealed class State161_66 {
    data object Loading : State161_66()
    data class Success(val data: String) : State161_66()
    data class Error(val message: String) : State161_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}