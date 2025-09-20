package com.awesomeapp.searchlocation

sealed class State600_38 {
    data object Loading : State600_38()
    data class Success(val data: String) : State600_38()
    data class Error(val message: String) : State600_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}