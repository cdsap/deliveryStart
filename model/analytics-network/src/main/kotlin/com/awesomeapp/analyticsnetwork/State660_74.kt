package com.awesomeapp.analyticsnetwork

sealed class State660_74 {
    data object Loading : State660_74()
    data class Success(val data: String) : State660_74()
    data class Error(val message: String) : State660_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}