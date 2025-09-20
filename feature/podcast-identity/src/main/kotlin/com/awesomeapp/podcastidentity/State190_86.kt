package com.awesomeapp.podcastidentity

sealed class State190_86 {
    data object Loading : State190_86()
    data class Success(val data: String) : State190_86()
    data class Error(val message: String) : State190_86()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}