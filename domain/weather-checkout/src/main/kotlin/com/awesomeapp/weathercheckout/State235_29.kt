package com.awesomeapp.weathercheckout

sealed class State235_29 {
    data object Loading : State235_29()
    data class Success(val data: String) : State235_29()
    data class Error(val message: String) : State235_29()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}