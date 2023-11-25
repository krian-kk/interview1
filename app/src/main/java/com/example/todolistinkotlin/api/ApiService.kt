package com.example.todolistinkotlin.api

import com.example.todolistinkotlin.database.ToDoListDataEntity
import retrofit2.http.GET

interface ApiService {

    @GET("add")
    suspend fun addNote()

    @GET("delete")
    suspend fun deleteNote()

    @GET("error")
    suspend fun getError()

    @GET("storeEvents")
    suspend fun storeEventToServer(
        eventName: String,
        params: ToDoListDataEntity
    ): AnalyticsResult<Boolean>
}