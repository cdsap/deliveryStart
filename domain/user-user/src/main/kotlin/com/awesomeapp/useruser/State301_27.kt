package com.awesomeapp.useruser

sealed class State301_27 {
    data object Loading : State301_27()
    data class Success(val data: String) : State301_27()
    data class Error(val message: String) : State301_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}