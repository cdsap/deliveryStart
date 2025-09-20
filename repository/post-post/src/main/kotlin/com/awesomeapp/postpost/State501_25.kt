package com.awesomeapp.postpost

sealed class State501_25 {
    data object Loading : State501_25()
    data class Success(val data: String) : State501_25()
    data class Error(val message: String) : State501_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}