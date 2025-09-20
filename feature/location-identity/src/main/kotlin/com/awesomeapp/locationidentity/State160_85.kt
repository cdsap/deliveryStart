package com.awesomeapp.locationidentity

sealed class State160_85 {
    data object Loading : State160_85()
    data class Success(val data: String) : State160_85()
    data class Error(val message: String) : State160_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}