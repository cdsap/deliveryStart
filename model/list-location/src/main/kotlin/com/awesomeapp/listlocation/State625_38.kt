package com.awesomeapp.listlocation

sealed class State625_38 {
    data object Loading : State625_38()
    data class Success(val data: String) : State625_38()
    data class Error(val message: String) : State625_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}