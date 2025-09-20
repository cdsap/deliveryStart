package com.awesomeapp.sharesearch

sealed class State555_33 {
    data object Loading : State555_33()
    data class Success(val data: String) : State555_33()
    data class Error(val message: String) : State555_33()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}