package com.awesomeapp.reportcheckout

sealed class State220_37 {
    data object Loading : State220_37()
    data class Success(val data: String) : State220_37()
    data class Error(val message: String) : State220_37()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}