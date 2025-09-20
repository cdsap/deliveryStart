package com.awesomeapp.galleryfeed

sealed class State438_31 {
    data object Loading : State438_31()
    data class Success(val data: String) : State438_31()
    data class Error(val message: String) : State438_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}