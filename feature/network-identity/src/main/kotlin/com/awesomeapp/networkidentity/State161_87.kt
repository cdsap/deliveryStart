package com.awesomeapp.networkidentity

sealed class State161_87 {
    data object Loading : State161_87()
    data class Success(val data: String) : State161_87()
    data class Error(val message: String) : State161_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}