package com.awesomeapp.postidentity

sealed class State158_69 {
    data object Loading : State158_69()
    data class Success(val data: String) : State158_69()
    data class Error(val message: String) : State158_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}