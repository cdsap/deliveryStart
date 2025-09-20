package com.awesomeapp.timersearch

sealed class State571_45 {
    data object Loading : State571_45()
    data class Success(val data: String) : State571_45()
    data class Error(val message: String) : State571_45()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}