package com.awesomeapp.syncidentity

sealed class State162_22 {
    data object Loading : State162_22()
    data class Success(val data: String) : State162_22()
    data class Error(val message: String) : State162_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}