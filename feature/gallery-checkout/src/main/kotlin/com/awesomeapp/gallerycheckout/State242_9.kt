package com.awesomeapp.gallerycheckout

sealed class State242_9 {
    data object Loading : State242_9()
    data class Success(val data: String) : State242_9()
    data class Error(val message: String) : State242_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}