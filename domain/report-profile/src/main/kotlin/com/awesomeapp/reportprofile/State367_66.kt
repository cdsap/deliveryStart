package com.awesomeapp.reportprofile

sealed class State367_66 {
    data object Loading : State367_66()
    data class Success(val data: String) : State367_66()
    data class Error(val message: String) : State367_66()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}