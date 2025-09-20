package com.awesomeapp.podcastcheckout

sealed class State239_39 {
    data object Loading : State239_39()
    data class Success(val data: String) : State239_39()
    data class Error(val message: String) : State239_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}