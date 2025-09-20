package com.awesomeapp.messagecart

sealed class State263_54 {
    data object Loading : State263_54()
    data class Success(val data: String) : State263_54()
    data class Error(val message: String) : State263_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}