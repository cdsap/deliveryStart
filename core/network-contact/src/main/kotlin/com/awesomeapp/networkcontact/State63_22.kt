package com.awesomeapp.networkcontact

sealed class State63_22 {
    data object Loading : State63_22()
    data class Success(val data: String) : State63_22()
    data class Error(val message: String) : State63_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}