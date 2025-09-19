package com.awesomeapp.audiouser

sealed class State342_10 {
    data object Loading : State342_10()
    data class Success(val data: String) : State342_10()
    data class Error(val message: String) : State342_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}