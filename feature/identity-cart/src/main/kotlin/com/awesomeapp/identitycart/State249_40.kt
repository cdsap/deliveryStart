package com.awesomeapp.identitycart

sealed class State249_40 {
    data object Loading : State249_40()
    data class Success(val data: String) : State249_40()
    data class Error(val message: String) : State249_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}