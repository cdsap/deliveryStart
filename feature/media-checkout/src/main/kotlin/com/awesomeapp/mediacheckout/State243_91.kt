package com.awesomeapp.mediacheckout

sealed class State243_91 {
    data object Loading : State243_91()
    data class Success(val data: String) : State243_91()
    data class Error(val message: String) : State243_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}