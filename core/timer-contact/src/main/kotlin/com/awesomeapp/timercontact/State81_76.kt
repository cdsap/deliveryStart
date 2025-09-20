package com.awesomeapp.timercontact

sealed class State81_76 {
    data object Loading : State81_76()
    data class Success(val data: String) : State81_76()
    data class Error(val message: String) : State81_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}