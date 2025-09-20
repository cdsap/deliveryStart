package com.awesomeapp.weatheruser

sealed class State333_88 {
    data object Loading : State333_88()
    data class Success(val data: String) : State333_88()
    data class Error(val message: String) : State333_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}