package com.awesomeapp.map

sealed class State38_18 {
    data object Loading : State38_18()
    data class Success(val data: String) : State38_18()
    data class Error(val message: String) : State38_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}