package com.example.myapplication.data

sealed interface ConnectionState{
    object Connected:ConnectionState
    object Disconnected:ConnectionState
    object Uninitialized:ConnectionState
    object CurrentlyIniitializing:ConnectionState
}