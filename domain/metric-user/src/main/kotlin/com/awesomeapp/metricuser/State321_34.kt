package com.awesomeapp.metricuser

sealed class State321_34 {
    data object Loading : State321_34()
    data class Success(val data: String) : State321_34()
    data class Error(val message: String) : State321_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}