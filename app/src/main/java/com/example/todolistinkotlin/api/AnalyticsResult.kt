package com.example.todolistinkotlin.api

sealed class AnalyticsResult<out T> {

    data class Success<T>(val data: T) : AnalyticsResult<T>()

    data class Error(val message: String) : AnalyticsResult<Nothing>()

}