package com.awesomeapp.podcastuser

sealed class State337_18 {
    data object Loading : State337_18()
    data class Success(val data: String) : State337_18()
    data class Error(val message: String) : State337_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}