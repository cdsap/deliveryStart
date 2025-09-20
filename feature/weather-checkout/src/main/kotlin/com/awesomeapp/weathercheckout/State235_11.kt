package com.awesomeapp.weathercheckout

sealed class State235_11 {
    data object Loading : State235_11()
    data class Success(val data: String) : State235_11()
    data class Error(val message: String) : State235_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}