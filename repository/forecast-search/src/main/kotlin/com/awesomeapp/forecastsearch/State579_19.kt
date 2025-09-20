package com.awesomeapp.forecastsearch

sealed class State579_19 {
    data object Loading : State579_19()
    data class Success(val data: String) : State579_19()
    data class Error(val message: String) : State579_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}