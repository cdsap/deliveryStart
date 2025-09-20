package com.awesomeapp.analyticsnetwork

sealed class State660_95 {
    data object Loading : State660_95()
    data class Success(val data: String) : State660_95()
    data class Error(val message: String) : State660_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}