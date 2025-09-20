package com.awesomeapp.metric

sealed class State27_136 {
    data object Loading : State27_136()
    data class Success(val data: String) : State27_136()
    data class Error(val message: String) : State27_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}