package com.awesomeapp.audiocontact

sealed class State97_48 {
    data object Loading : State97_48()
    data class Success(val data: String) : State97_48()
    data class Error(val message: String) : State97_48()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}