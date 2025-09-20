package com.awesomeapp.commentlocation

sealed class State598_69 {
    data object Loading : State598_69()
    data class Success(val data: String) : State598_69()
    data class Error(val message: String) : State598_69()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}