package com.awesomeapp.galleryidentity

sealed class State193_57 {
    data object Loading : State193_57()
    data class Success(val data: String) : State193_57()
    data class Error(val message: String) : State193_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}