package com.awesomeapp.audiocontact

sealed class State97_54 {
    data object Loading : State97_54()
    data class Success(val data: String) : State97_54()
    data class Error(val message: String) : State97_54()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}