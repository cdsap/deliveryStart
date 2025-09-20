package com.awesomeapp.photocontact

sealed class State94_39 {
    data object Loading : State94_39()
    data class Success(val data: String) : State94_39()
    data class Error(val message: String) : State94_39()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}