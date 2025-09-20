package com.awesomeapp.statuscheckout

sealed class State222_94 {
    data object Loading : State222_94()
    data class Success(val data: String) : State222_94()
    data class Error(val message: String) : State222_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}