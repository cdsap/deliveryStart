package com.awesomeapp.audiocontact

sealed class State97_36 {
    data object Loading : State97_36()
    data class Success(val data: String) : State97_36()
    data class Error(val message: String) : State97_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}