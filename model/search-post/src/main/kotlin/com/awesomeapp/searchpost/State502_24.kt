package com.awesomeapp.searchpost

sealed class State502_24 {
    data object Loading : State502_24()
    data class Success(val data: String) : State502_24()
    data class Error(val message: String) : State502_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}