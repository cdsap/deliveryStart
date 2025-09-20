package com.awesomeapp.podcastcheckout

sealed class State239_87 {
    data object Loading : State239_87()
    data class Success(val data: String) : State239_87()
    data class Error(val message: String) : State239_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}