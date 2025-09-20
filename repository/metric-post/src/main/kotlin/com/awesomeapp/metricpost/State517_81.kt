package com.awesomeapp.metricpost

sealed class State517_81 {
    data object Loading : State517_81()
    data class Success(val data: String) : State517_81()
    data class Error(val message: String) : State517_81()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}