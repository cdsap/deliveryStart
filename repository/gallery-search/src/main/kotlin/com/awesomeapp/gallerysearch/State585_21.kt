package com.awesomeapp.gallerysearch

sealed class State585_21 {
    data object Loading : State585_21()
    data class Success(val data: String) : State585_21()
    data class Error(val message: String) : State585_21()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}