package com.example.todolistinkotlin.api

import com.example.todolistinkotlin.database.ToDoListDataEntity
import retrofit2.http.POST

interface ApiService {
    @POST("storeEvents")
    suspend fun storeEventToServer(
        eventName: String, params: ToDoListDataEntity
    ): AnalyticsResult<Boolean>

    @POST("delete")
    suspend fun deleteEvent(eventName: String, id: String): AnalyticsResult<Boolean>
}