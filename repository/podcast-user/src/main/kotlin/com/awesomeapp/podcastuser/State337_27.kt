package com.awesomeapp.podcastuser

sealed class State337_27 {
    data object Loading : State337_27()
    data class Success(val data: String) : State337_27()
    data class Error(val message: String) : State337_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}