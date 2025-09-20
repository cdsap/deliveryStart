package com.awesomeapp.documentlocation

sealed class State622_21 {
    data object Loading : State622_21()
    data class Success(val data: String) : State622_21()
    data class Error(val message: String) : State622_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}