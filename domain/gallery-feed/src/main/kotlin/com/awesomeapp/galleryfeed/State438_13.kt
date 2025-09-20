package com.awesomeapp.galleryfeed

sealed class State438_13 {
    data object Loading : State438_13()
    data class Success(val data: String) : State438_13()
    data class Error(val message: String) : State438_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}