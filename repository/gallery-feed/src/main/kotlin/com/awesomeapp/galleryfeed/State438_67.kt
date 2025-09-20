package com.awesomeapp.galleryfeed

sealed class State438_67 {
    data object Loading : State438_67()
    data class Success(val data: String) : State438_67()
    data class Error(val message: String) : State438_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}