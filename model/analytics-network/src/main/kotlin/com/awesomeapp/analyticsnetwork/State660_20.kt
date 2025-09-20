package com.awesomeapp.analyticsnetwork

sealed class State660_20 {
    data object Loading : State660_20()
    data class Success(val data: String) : State660_20()
    data class Error(val message: String) : State660_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}