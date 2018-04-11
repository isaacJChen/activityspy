package edu.washington.isaacjc.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i(tag, "onStart fired: $intent")
    }

    override fun onResume() {
        super.onResume()
        Log.i(tag, "onResume fired: $intent")
    }

    override fun onPause() {
        super.onPause()
        Log.i(tag, "onPause fired: $intent")
    }

    override fun onStop() {
        super.onStop()
        Log.i(tag, "onStop fired: $intent")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(tag, "onRestart fired: $intent")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(tag, "onDestroy fired: $intent")
        Log.e(tag, "We’re going down, Captain!")
    }
}
