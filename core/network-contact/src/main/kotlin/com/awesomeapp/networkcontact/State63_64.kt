package com.awesomeapp.networkcontact

sealed class State63_64 {
    data object Loading : State63_64()
    data class Success(val data: String) : State63_64()
    data class Error(val message: String) : State63_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}