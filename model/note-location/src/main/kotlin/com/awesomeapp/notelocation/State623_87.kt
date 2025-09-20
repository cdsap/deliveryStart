package com.awesomeapp.notelocation

sealed class State623_87 {
    data object Loading : State623_87()
    data class Success(val data: String) : State623_87()
    data class Error(val message: String) : State623_87()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}