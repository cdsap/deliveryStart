package com.awesomeapp.metriclocation

sealed class State615_30 {
    data object Loading : State615_30()
    data class Success(val data: String) : State615_30()
    data class Error(val message: String) : State615_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}