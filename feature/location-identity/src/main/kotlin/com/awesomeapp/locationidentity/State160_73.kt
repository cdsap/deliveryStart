package com.awesomeapp.locationidentity

sealed class State160_73 {
    data object Loading : State160_73()
    data class Success(val data: String) : State160_73()
    data class Error(val message: String) : State160_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}