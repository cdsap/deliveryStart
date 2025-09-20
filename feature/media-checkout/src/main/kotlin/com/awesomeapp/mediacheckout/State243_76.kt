package com.awesomeapp.mediacheckout

sealed class State243_76 {
    data object Loading : State243_76()
    data class Success(val data: String) : State243_76()
    data class Error(val message: String) : State243_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}