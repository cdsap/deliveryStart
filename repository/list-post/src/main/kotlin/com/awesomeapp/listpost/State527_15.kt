package com.awesomeapp.listpost

sealed class State527_15 {
    data object Loading : State527_15()
    data class Success(val data: String) : State527_15()
    data class Error(val message: String) : State527_15()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}