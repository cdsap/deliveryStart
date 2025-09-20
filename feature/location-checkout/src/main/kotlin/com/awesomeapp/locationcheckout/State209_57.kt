package com.awesomeapp.locationcheckout

sealed class State209_57 {
    data object Loading : State209_57()
    data class Success(val data: String) : State209_57()
    data class Error(val message: String) : State209_57()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}