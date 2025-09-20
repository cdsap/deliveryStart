package com.awesomeapp.metricprofile

sealed class State370_62 {
    data object Loading : State370_62()
    data class Success(val data: String) : State370_62()
    data class Error(val message: String) : State370_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}