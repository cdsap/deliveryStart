package com.awesomeapp.checkoutuser

sealed class State299_54 {
    data object Loading : State299_54()
    data class Success(val data: String) : State299_54()
    data class Error(val message: String) : State299_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}