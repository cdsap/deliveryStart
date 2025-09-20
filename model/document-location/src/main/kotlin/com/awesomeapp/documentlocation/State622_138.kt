package com.awesomeapp.documentlocation

sealed class State622_138 {
    data object Loading : State622_138()
    data class Success(val data: String) : State622_138()
    data class Error(val message: String) : State622_138()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}