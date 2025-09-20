package com.awesomeapp.identitycontact

sealed class State53_36 {
    data object Loading : State53_36()
    data class Success(val data: String) : State53_36()
    data class Error(val message: String) : State53_36()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}