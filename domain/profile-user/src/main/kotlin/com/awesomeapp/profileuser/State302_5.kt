package com.awesomeapp.profileuser

sealed class State302_5 {
    data object Loading : State302_5()
    data class Success(val data: String) : State302_5()
    data class Error(val message: String) : State302_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}