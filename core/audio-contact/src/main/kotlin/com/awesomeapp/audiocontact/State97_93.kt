package com.awesomeapp.audiocontact

sealed class State97_93 {
    data object Loading : State97_93()
    data class Success(val data: String) : State97_93()
    data class Error(val message: String) : State97_93()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}