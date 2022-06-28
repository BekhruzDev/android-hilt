package com.example.android.hilt.data

//Common interface for logger data sources
interface LoggerDataSource{
    fun addLog(msg:String)
    fun getAllLogs(callback:(List<Log>) -> Unit)
    fun removeLogs()
}