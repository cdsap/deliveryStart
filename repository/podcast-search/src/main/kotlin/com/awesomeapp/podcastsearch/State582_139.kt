package com.awesomeapp.podcastsearch

sealed class State582_139 {
    data object Loading : State582_139()
    data class Success(val data: String) : State582_139()
    data class Error(val message: String) : State582_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}