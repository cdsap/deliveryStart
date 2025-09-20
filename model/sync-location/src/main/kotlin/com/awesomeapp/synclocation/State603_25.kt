package com.awesomeapp.synclocation

sealed class State603_25 {
    data object Loading : State603_25()
    data class Success(val data: String) : State603_25()
    data class Error(val message: String) : State603_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}