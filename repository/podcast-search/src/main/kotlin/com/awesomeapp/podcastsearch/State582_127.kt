package com.awesomeapp.podcastsearch

sealed class State582_127 {
    data object Loading : State582_127()
    data class Success(val data: String) : State582_127()
    data class Error(val message: String) : State582_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}