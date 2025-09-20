package com.awesomeapp.audiocontact

sealed class State97_99 {
    data object Loading : State97_99()
    data class Success(val data: String) : State97_99()
    data class Error(val message: String) : State97_99()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}