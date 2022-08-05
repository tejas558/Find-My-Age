package com.t558.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val BNfindAge = findViewById<Button>(R.id.BNfindAge)
        val ETbirthYear = findViewById<EditText>(R.id.ETbirthYear)
        val TVshowAge = findViewById<TextView>(R.id.TVshowAge)
        BNfindAge.setOnClickListener {
            var year = ETbirthYear.text.toString().toInt()
            var currYear = Calendar.getInstance().get(Calendar.YEAR)
            var displayYear = currYear - year
            TVshowAge.text = "Your age is $displayYear"
        }
    }
}