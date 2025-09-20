package com.awesomeapp.timercontact

sealed class State81_109 {
    data object Loading : State81_109()
    data class Success(val data: String) : State81_109()
    data class Error(val message: String) : State81_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}