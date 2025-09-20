package com.awesomeapp.listpost

sealed class State527_78 {
    data object Loading : State527_78()
    data class Success(val data: String) : State527_78()
    data class Error(val message: String) : State527_78()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}