package com.awesomeapp.networksync

sealed class State700_97 {
    data object Loading : State700_97()
    data class Success(val data: String) : State700_97()
    data class Error(val message: String) : State700_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}