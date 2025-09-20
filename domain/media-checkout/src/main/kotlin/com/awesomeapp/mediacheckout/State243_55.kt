package com.awesomeapp.mediacheckout

sealed class State243_55 {
    data object Loading : State243_55()
    data class Success(val data: String) : State243_55()
    data class Error(val message: String) : State243_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}