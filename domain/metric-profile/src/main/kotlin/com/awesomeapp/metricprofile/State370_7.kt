package com.awesomeapp.metricprofile

sealed class State370_7 {
    data object Loading : State370_7()
    data class Success(val data: String) : State370_7()
    data class Error(val message: String) : State370_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}