package com.awesomeapp.commentlocation

sealed class State598_144 {
    data object Loading : State598_144()
    data class Success(val data: String) : State598_144()
    data class Error(val message: String) : State598_144()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}