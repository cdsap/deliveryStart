package com.awesomeapp.reportlocation

sealed class State612_27 {
    data object Loading : State612_27()
    data class Success(val data: String) : State612_27()
    data class Error(val message: String) : State612_27()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}