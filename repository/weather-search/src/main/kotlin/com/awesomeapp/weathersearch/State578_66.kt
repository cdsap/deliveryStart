package com.awesomeapp.weathersearch

sealed class State578_66 {
    data object Loading : State578_66()
    data class Success(val data: String) : State578_66()
    data class Error(val message: String) : State578_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}