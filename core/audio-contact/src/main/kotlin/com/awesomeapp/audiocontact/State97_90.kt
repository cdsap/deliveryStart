package com.awesomeapp.audiocontact

sealed class State97_90 {
    data object Loading : State97_90()
    data class Success(val data: String) : State97_90()
    data class Error(val message: String) : State97_90()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}