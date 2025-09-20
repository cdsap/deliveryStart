package com.awesomeapp.contactcontact

sealed class State51_67 {
    data object Loading : State51_67()
    data class Success(val data: String) : State51_67()
    data class Error(val message: String) : State51_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}