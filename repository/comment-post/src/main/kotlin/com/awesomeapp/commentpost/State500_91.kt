package com.awesomeapp.commentpost

sealed class State500_91 {
    data object Loading : State500_91()
    data class Success(val data: String) : State500_91()
    data class Error(val message: String) : State500_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}