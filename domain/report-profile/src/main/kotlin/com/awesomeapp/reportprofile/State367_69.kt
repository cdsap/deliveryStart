package com.awesomeapp.reportprofile

sealed class State367_69 {
    data object Loading : State367_69()
    data class Success(val data: String) : State367_69()
    data class Error(val message: String) : State367_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}