package com.awesomeapp.synccart

sealed class State260_67 {
    data object Loading : State260_67()
    data class Success(val data: String) : State260_67()
    data class Error(val message: String) : State260_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}