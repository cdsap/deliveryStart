package com.awesomeapp.podcastcheckout

sealed class State239_51 {
    data object Loading : State239_51()
    data class Success(val data: String) : State239_51()
    data class Error(val message: String) : State239_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}