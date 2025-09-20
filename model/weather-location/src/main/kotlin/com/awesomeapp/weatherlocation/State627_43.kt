package com.awesomeapp.weatherlocation

sealed class State627_43 {
    data object Loading : State627_43()
    data class Success(val data: String) : State627_43()
    data class Error(val message: String) : State627_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}