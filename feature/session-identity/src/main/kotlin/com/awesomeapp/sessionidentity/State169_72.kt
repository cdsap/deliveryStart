package com.awesomeapp.sessionidentity

sealed class State169_72 {
    data object Loading : State169_72()
    data class Success(val data: String) : State169_72()
    data class Error(val message: String) : State169_72()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}