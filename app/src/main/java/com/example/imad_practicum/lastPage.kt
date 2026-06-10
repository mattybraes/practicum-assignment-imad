package com.example.imad_practicum

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lastPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_last_page)


        class lastPage : appCompactActivty() {
            super.onCreate(savedIntanceState)
            setContentView(R.activity_detail)

            val txtDetails = findViewById<Textview>(R.id.txtDetails)
            val btnBack = findViewById<Button>(R.id.btnback)

            val items = intent.getStringArrayListExtra("items")
            val categories  =intent.getStringArrayListExtra("categories")
            val quantities = intent.getStringArrayListExtra("quantities")

          var details = ""

         if (items != null && quantities != null) {















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}