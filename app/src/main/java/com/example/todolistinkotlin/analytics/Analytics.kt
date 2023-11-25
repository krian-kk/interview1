package com.example.todolistinkotlin.analytics

import com.example.todolistinkotlin.api.ApiHelper
import com.example.todolistinkotlin.database.ToDoListDataEntity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Analytics(val apiHelper: ApiHelper) : AnalyticsHelper {

    override fun storeEvent(eventName: String, newTodo: ToDoListDataEntity) {
        GlobalScope.launch {
            apiHelper.storeEvent(eventName, newTodo)
        }
    }

    override fun deleteEvent(eventName: String, todoId: String) {
        GlobalScope.launch {
            apiHelper.deleteEvent(eventName, todoId)
        }
    }
}

