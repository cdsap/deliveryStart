package com.awesomeapp.photouser

sealed class State339_55 {
    data object Loading : State339_55()
    data class Success(val data: String) : State339_55()
    data class Error(val message: String) : State339_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}