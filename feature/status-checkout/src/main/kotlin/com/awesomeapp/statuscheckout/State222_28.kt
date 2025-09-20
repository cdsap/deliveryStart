package com.awesomeapp.statuscheckout

sealed class State222_28 {
    data object Loading : State222_28()
    data class Success(val data: String) : State222_28()
    data class Error(val message: String) : State222_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}