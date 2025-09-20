package com.awesomeapp.groupcheckout

sealed class State213_25 {
    data object Loading : State213_25()
    data class Success(val data: String) : State213_25()
    data class Error(val message: String) : State213_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}