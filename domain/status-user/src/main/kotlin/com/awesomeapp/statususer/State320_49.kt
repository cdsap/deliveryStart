package com.awesomeapp.statususer

sealed class State320_49 {
    data object Loading : State320_49()
    data class Success(val data: String) : State320_49()
    data class Error(val message: String) : State320_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}