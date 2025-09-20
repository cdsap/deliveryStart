package com.awesomeapp.sharecart

sealed class State261_25 {
    data object Loading : State261_25()
    data class Success(val data: String) : State261_25()
    data class Error(val message: String) : State261_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}