package com.awesomeapp.mapcart

sealed class State283_66 {
    data object Loading : State283_66()
    data class Success(val data: String) : State283_66()
    data class Error(val message: String) : State283_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}