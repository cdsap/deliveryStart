package com.awesomeapp.podcastcheckout

sealed class State239_57 {
    data object Loading : State239_57()
    data class Success(val data: String) : State239_57()
    data class Error(val message: String) : State239_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}