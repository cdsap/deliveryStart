package com.awesomeapp.groupprofile

sealed class State360_14 {
    data object Loading : State360_14()
    data class Success(val data: String) : State360_14()
    data class Error(val message: String) : State360_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}