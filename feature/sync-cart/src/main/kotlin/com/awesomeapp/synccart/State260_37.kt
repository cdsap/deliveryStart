package com.awesomeapp.synccart

sealed class State260_37 {
    data object Loading : State260_37()
    data class Success(val data: String) : State260_37()
    data class Error(val message: String) : State260_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}