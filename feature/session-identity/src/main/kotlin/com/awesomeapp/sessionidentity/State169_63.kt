package com.awesomeapp.sessionidentity

sealed class State169_63 {
    data object Loading : State169_63()
    data class Success(val data: String) : State169_63()
    data class Error(val message: String) : State169_63()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}