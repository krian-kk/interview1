package com.example.todolistinkotlin.analytics

import com.example.todolistinkotlin.database.ToDoListDataEntity


interface AnalyticsHelper {
    fun storeEvent(eventName: String, newTodo: ToDoListDataEntity)

}