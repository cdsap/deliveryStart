package com.awesomeapp.audioidentity

sealed class State195_81 {
    data object Loading : State195_81()
    data class Success(val data: String) : State195_81()
    data class Error(val message: String) : State195_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}