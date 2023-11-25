package com.example.todolistinkotlin.api

import com.example.todolistinkotlin.database.ToDoListDataEntity
import java.lang.Exception

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {
    override suspend fun storeEvent(
        eventName: String, params: ToDoListDataEntity
    ): AnalyticsResult<Boolean> {
        return try {
            val result = apiService.storeEventToServer(eventName, params)
            when (result) {
                is AnalyticsResult.Success<Boolean> -> println("Event captured successfully")
                else -> AnalyticsResult.Error("Event capture failed")
            }
            result
        } catch (exception: Exception) {
            println(exception)
            AnalyticsResult.Error("Unknown Error")
        }
    }

    override suspend fun deleteEvent(eventName: String, id: String): AnalyticsResult<Boolean> {
        return try {
            val result = apiService.deleteEvent(eventName, id)
            when (result) {
                is AnalyticsResult.Success<Boolean> -> println("Event deleted successfully")
                else -> AnalyticsResult.Error("Event delete failed")
            }
            result
        } catch (exception: Exception) {
            println(exception)
            AnalyticsResult.Error("Unknown Error")
        }
    }
}