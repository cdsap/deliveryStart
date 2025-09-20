package com.awesomeapp.analyticsnetwork

sealed class State660_62 {
    data object Loading : State660_62()
    data class Success(val data: String) : State660_62()
    data class Error(val message: String) : State660_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}