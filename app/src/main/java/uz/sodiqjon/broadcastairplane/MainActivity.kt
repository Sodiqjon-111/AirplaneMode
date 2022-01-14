package uz.sodiqjon.broadcastairplane

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var receiver:InternetCheckSevice
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        receiver= InternetCheckSevice()

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(InternetCheckSevice(), it)

        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(receiver)
    }
}