package com.awesomeapp.statuscheckout

sealed class State222_88 {
    data object Loading : State222_88()
    data class Success(val data: String) : State222_88()
    data class Error(val message: String) : State222_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}