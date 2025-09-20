package com.awesomeapp.metricprofile

sealed class State370_71 {
    data object Loading : State370_71()
    data class Success(val data: String) : State370_71()
    data class Error(val message: String) : State370_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}