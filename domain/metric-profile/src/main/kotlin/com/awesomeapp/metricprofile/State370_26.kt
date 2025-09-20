package com.awesomeapp.metricprofile

sealed class State370_26 {
    data object Loading : State370_26()
    data class Success(val data: String) : State370_26()
    data class Error(val message: String) : State370_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}