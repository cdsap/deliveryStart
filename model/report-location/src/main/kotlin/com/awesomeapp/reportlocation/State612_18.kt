package com.awesomeapp.reportlocation

sealed class State612_18 {
    data object Loading : State612_18()
    data class Success(val data: String) : State612_18()
    data class Error(val message: String) : State612_18()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}