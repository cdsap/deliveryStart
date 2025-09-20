package com.awesomeapp.contactlocation

sealed class State590_17 {
    data object Loading : State590_17()
    data class Success(val data: String) : State590_17()
    data class Error(val message: String) : State590_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}