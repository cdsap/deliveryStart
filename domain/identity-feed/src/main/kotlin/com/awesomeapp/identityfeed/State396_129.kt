package com.awesomeapp.identityfeed

sealed class State396_129 {
    data object Loading : State396_129()
    data class Success(val data: String) : State396_129()
    data class Error(val message: String) : State396_129()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}