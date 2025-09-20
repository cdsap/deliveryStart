package com.awesomeapp.mediacontact

sealed class State96_66 {
    data object Loading : State96_66()
    data class Success(val data: String) : State96_66()
    data class Error(val message: String) : State96_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}