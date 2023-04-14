package com.example.myapplication.presentation


import android.bluetooth.BluetoothAdapter
import androidx.compose.runtime.Composable
import com.example.myapplication.presentation.permissions.SystemBroadcastReceiver

@Composable
fun TemperatureHumidityScreen(
    onBluetoothStateChanged:()->Unit
){
    SystemBroadcastReceiver(systemAction = BluetoothAdapter.ACTION_STATE_CHANGED){bluetoothState ->
        val action = bluetoothState?.action?: return@SystemBroadcastReceiver
        if(action == BluetoothAdapter.ACTION_STATE_CHANGED){
            onBluetoothStateChanged()
        }
    }
}
