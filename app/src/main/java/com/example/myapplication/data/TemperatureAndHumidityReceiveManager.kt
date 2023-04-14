package com.example.myapplication.data

import com.example.myapplication.util.Resource
import kotlinx.coroutines.flow.MutableSharedFlow

interface TemperatureAndHumidityReceiveManager {
    val data:MutableSharedFlow<Resource<TempHumidityResult>>

    fun reconnect()

    fun disconnect()

    fun startReceiving()

    fun closeConnection()

}