package com.awesomeapp.profileidentity

sealed class State155_65 {
    data object Loading : State155_65()
    data class Success(val data: String) : State155_65()
    data class Error(val message: String) : State155_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}