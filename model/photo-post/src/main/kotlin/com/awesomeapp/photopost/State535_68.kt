package com.awesomeapp.photopost

sealed class State535_68 {
    data object Loading : State535_68()
    data class Success(val data: String) : State535_68()
    data class Error(val message: String) : State535_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}