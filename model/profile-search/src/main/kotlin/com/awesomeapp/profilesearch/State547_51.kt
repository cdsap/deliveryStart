package com.awesomeapp.profilesearch

sealed class State547_51 {
    data object Loading : State547_51()
    data class Success(val data: String) : State547_51()
    data class Error(val message: String) : State547_51()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}