package com.awesomeapp.weathersearch

sealed class State578_60 {
    data object Loading : State578_60()
    data class Success(val data: String) : State578_60()
    data class Error(val message: String) : State578_60()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}