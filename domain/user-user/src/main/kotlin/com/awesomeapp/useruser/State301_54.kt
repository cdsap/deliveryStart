package com.awesomeapp.useruser

sealed class State301_54 {
    data object Loading : State301_54()
    data class Success(val data: String) : State301_54()
    data class Error(val message: String) : State301_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}