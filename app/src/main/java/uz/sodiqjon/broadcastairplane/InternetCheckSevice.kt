package uz.sodiqjon.broadcastairplane

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast


class InternetCheckSevice: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isNetworkEnable=intent?.getBooleanExtra("state",false) ?: return
        if (isNetworkEnable){
            Toast.makeText(context, "Network Enabe", Toast.LENGTH_SHORT).show()
        }
        Toast.makeText(context, "Network Disable", Toast.LENGTH_SHORT).show()
    }
}