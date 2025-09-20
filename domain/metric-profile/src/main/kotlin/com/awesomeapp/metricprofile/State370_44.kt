package com.awesomeapp.metricprofile

sealed class State370_44 {
    data object Loading : State370_44()
    data class Success(val data: String) : State370_44()
    data class Error(val message: String) : State370_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}