package com.awesomeapp.audio

sealed class State48_27 {
    data object Loading : State48_27()
    data class Success(val data: String) : State48_27()
    data class Error(val message: String) : State48_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}