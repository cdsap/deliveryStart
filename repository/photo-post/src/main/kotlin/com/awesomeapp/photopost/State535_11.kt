package com.awesomeapp.photopost

sealed class State535_11 {
    data object Loading : State535_11()
    data class Success(val data: String) : State535_11()
    data class Error(val message: String) : State535_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}