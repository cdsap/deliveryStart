package com.awesomeapp.gallerysearch

sealed class State585_18 {
    data object Loading : State585_18()
    data class Success(val data: String) : State585_18()
    data class Error(val message: String) : State585_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}