package com.awesomeapp.mediacheckout

sealed class State243_46 {
    data object Loading : State243_46()
    data class Success(val data: String) : State243_46()
    data class Error(val message: String) : State243_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}