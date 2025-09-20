package com.awesomeapp.mapidentity

sealed class State185_23 {
    data object Loading : State185_23()
    data class Success(val data: String) : State185_23()
    data class Error(val message: String) : State185_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}