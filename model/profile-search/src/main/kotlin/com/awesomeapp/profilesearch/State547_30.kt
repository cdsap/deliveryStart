package com.awesomeapp.profilesearch

sealed class State547_30 {
    data object Loading : State547_30()
    data class Success(val data: String) : State547_30()
    data class Error(val message: String) : State547_30()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}