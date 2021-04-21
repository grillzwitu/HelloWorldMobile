package com.example.helloworldmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var clickCount:Int = 0

    fun clicked(view: View) {
        clickCount++

        var output = findViewById<TextView>(R.id.text_view) as TextView

        output.text = clickCount.toString()
    }
}