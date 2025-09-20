package com.awesomeapp.galleryidentity

sealed class State193_21 {
    data object Loading : State193_21()
    data class Success(val data: String) : State193_21()
    data class Error(val message: String) : State193_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}