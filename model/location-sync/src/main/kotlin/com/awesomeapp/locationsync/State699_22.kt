package com.awesomeapp.locationsync

sealed class State699_22 {
    data object Loading : State699_22()
    data class Success(val data: String) : State699_22()
    data class Error(val message: String) : State699_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}