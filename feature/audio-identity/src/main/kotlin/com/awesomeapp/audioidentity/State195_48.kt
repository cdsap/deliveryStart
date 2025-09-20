package com.awesomeapp.audioidentity

sealed class State195_48 {
    data object Loading : State195_48()
    data class Success(val data: String) : State195_48()
    data class Error(val message: String) : State195_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}