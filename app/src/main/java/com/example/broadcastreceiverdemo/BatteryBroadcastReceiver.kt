package com.example.broadcastreceiverdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.BatteryManager
import android.util.Log

class BatteryBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            val level: Int = it.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
            val scale: Int = it.getIntExtra(BatteryManager.EXTRA_SCALE, -1)
            val percentage = level * 100 / scale.toFloat()
            Log.d("BatteryBroadcastReceiver", "Current battery level is $percentage")
        }
    }
}