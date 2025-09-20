package com.awesomeapp.sharelocation

sealed class State604_59 {
    data object Loading : State604_59()
    data class Success(val data: String) : State604_59()
    data class Error(val message: String) : State604_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}