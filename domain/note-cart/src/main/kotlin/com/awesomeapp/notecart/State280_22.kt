package com.awesomeapp.notecart

sealed class State280_22 {
    data object Loading : State280_22()
    data class Success(val data: String) : State280_22()
    data class Error(val message: String) : State280_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}