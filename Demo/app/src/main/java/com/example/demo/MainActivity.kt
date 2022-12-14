package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

// LogCat filter --->  MainActivity D com.example.demo 6090-6090

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "On Create")

        val firstFragment = BlankFragment()
        val secondFragment = BlankFragment2()

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)


        // setting the initial fragment - firstFragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            addToBackStack(null)
            commit()
        }

        button1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }

        button2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
                commit()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "On Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "On Re-Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "On Re-resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "On Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "On Destroy")
    }
}
