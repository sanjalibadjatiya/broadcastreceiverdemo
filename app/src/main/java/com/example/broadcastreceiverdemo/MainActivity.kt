package com.example.broadcastreceiverdemo

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var batteryBroadcastReceiver: BatteryBroadcastReceiver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        batteryBroadcastReceiver = BatteryBroadcastReceiver()
    }

    override fun onResume() {
        super.onResume()
        registerReceiver(batteryBroadcastReceiver, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(batteryBroadcastReceiver)
    }
}