package com.awesomeapp.podcastsearch

sealed class State582_148 {
    data object Loading : State582_148()
    data class Success(val data: String) : State582_148()
    data class Error(val message: String) : State582_148()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}