package com.awesomeapp.calendarlocation

sealed class State617_24 {
    data object Loading : State617_24()
    data class Success(val data: String) : State617_24()
    data class Error(val message: String) : State617_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}