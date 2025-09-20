package com.awesomeapp.locationidentity

sealed class State160_109 {
    data object Loading : State160_109()
    data class Success(val data: String) : State160_109()
    data class Error(val message: String) : State160_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}