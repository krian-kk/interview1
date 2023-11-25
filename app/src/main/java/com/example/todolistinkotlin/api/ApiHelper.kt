package com.example.todolistinkotlin.api

import com.example.todolistinkotlin.database.ToDoListDataEntity

interface ApiHelper {
    suspend fun storeEvent(
        eventName: String, params: ToDoListDataEntity
    ): AnalyticsResult<Boolean>
}