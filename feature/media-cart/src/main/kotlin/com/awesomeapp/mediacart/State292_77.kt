package com.awesomeapp.mediacart

sealed class State292_77 {
    data object Loading : State292_77()
    data class Success(val data: String) : State292_77()
    data class Error(val message: String) : State292_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}