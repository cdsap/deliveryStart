package com.awesomeapp.gallerycheckout

sealed class State242_24 {
    data object Loading : State242_24()
    data class Success(val data: String) : State242_24()
    data class Error(val message: String) : State242_24()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}