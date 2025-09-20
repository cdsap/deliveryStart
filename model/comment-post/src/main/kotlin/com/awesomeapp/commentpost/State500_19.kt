package com.awesomeapp.commentpost

sealed class State500_19 {
    data object Loading : State500_19()
    data class Success(val data: String) : State500_19()
    data class Error(val message: String) : State500_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}