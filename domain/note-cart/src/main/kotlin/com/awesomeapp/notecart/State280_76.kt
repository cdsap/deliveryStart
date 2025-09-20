package com.awesomeapp.notecart

sealed class State280_76 {
    data object Loading : State280_76()
    data class Success(val data: String) : State280_76()
    data class Error(val message: String) : State280_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}