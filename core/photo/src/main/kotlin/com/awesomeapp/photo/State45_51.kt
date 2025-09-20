package com.awesomeapp.photo

sealed class State45_51 {
    data object Loading : State45_51()
    data class Success(val data: String) : State45_51()
    data class Error(val message: String) : State45_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}