package com.awesomeapp.statususer

sealed class State320_19 {
    data object Loading : State320_19()
    data class Success(val data: String) : State320_19()
    data class Error(val message: String) : State320_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}