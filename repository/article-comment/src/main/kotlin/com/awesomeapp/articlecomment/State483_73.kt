package com.awesomeapp.articlecomment

sealed class State483_73 {
    data object Loading : State483_73()
    data class Success(val data: String) : State483_73()
    data class Error(val message: String) : State483_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}