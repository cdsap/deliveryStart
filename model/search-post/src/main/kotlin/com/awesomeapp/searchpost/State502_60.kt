package com.awesomeapp.searchpost

sealed class State502_60 {
    data object Loading : State502_60()
    data class Success(val data: String) : State502_60()
    data class Error(val message: String) : State502_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}