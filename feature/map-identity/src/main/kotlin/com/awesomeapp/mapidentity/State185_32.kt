package com.awesomeapp.mapidentity

sealed class State185_32 {
    data object Loading : State185_32()
    data class Success(val data: String) : State185_32()
    data class Error(val message: String) : State185_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}