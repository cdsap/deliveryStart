package com.awesomeapp.syncpost

sealed class State505_59 {
    data object Loading : State505_59()
    data class Success(val data: String) : State505_59()
    data class Error(val message: String) : State505_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}