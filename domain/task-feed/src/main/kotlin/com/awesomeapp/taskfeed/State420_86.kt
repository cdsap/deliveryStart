package com.awesomeapp.taskfeed

sealed class State420_86 {
    data object Loading : State420_86()
    data class Success(val data: String) : State420_86()
    data class Error(val message: String) : State420_86()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}