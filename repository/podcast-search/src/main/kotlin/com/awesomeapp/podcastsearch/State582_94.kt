package com.awesomeapp.podcastsearch

sealed class State582_94 {
    data object Loading : State582_94()
    data class Success(val data: String) : State582_94()
    data class Error(val message: String) : State582_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}