package com.awesomeapp.mapcontact

sealed class State87_67 {
    data object Loading : State87_67()
    data class Success(val data: String) : State87_67()
    data class Error(val message: String) : State87_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}