package com.awesomeapp.metriclocation

sealed class State615_102 {
    data object Loading : State615_102()
    data class Success(val data: String) : State615_102()
    data class Error(val message: String) : State615_102()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}