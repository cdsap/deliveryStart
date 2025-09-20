package com.awesomeapp.audiocontact

sealed class State97_87 {
    data object Loading : State97_87()
    data class Success(val data: String) : State97_87()
    data class Error(val message: String) : State97_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}