package com.awesomeapp.mapuser

sealed class State332_59 {
    data object Loading : State332_59()
    data class Success(val data: String) : State332_59()
    data class Error(val message: String) : State332_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}