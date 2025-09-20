package com.awesomeapp.weatherlocation

sealed class State627_55 {
    data object Loading : State627_55()
    data class Success(val data: String) : State627_55()
    data class Error(val message: String) : State627_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}