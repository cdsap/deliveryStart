package com.awesomeapp.galleryfeed

sealed class State438_46 {
    data object Loading : State438_46()
    data class Success(val data: String) : State438_46()
    data class Error(val message: String) : State438_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}