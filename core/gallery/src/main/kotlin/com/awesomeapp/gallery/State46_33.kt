package com.awesomeapp.gallery

sealed class State46_33 {
    data object Loading : State46_33()
    data class Success(val data: String) : State46_33()
    data class Error(val message: String) : State46_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}