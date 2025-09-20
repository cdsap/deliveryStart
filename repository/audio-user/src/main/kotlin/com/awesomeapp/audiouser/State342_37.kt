package com.awesomeapp.audiouser

sealed class State342_37 {
    data object Loading : State342_37()
    data class Success(val data: String) : State342_37()
    data class Error(val message: String) : State342_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}