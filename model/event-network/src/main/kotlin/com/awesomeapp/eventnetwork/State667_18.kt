package com.awesomeapp.eventnetwork

sealed class State667_18 {
    data object Loading : State667_18()
    data class Success(val data: String) : State667_18()
    data class Error(val message: String) : State667_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}