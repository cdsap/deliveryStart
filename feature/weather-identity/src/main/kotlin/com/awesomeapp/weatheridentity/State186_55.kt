package com.awesomeapp.weatheridentity

sealed class State186_55 {
    data object Loading : State186_55()
    data class Success(val data: String) : State186_55()
    data class Error(val message: String) : State186_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}