package com.awesomeapp.note

sealed class State35_17 {
    data object Loading : State35_17()
    data class Success(val data: String) : State35_17()
    data class Error(val message: String) : State35_17()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}