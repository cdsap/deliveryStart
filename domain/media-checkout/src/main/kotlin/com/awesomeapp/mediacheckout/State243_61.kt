package com.awesomeapp.mediacheckout

sealed class State243_61 {
    data object Loading : State243_61()
    data class Success(val data: String) : State243_61()
    data class Error(val message: String) : State243_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}