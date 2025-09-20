package com.awesomeapp.searchnetwork

sealed class State649_129 {
    data object Loading : State649_129()
    data class Success(val data: String) : State649_129()
    data class Error(val message: String) : State649_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}