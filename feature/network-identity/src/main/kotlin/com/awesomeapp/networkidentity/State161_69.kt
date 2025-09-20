package com.awesomeapp.networkidentity

sealed class State161_69 {
    data object Loading : State161_69()
    data class Success(val data: String) : State161_69()
    data class Error(val message: String) : State161_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}