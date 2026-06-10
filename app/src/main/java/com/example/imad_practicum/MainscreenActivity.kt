package com.example.imad_practicum

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.mainscreen)

      val items = arrayListOf("tent","marshmallows", "flashlight")
        val categories = arrayListOf("shelter", "food", "safety")
        val quantities = arrayListOf(1, 3, 2)

        @SuppressLint("MissingSuperCall")
        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.mainscreen)

            val txtTotal = findViewById<TextView>(R.id.txtTotal)
            val btnAdd = findViewById<Button>(R.id.btnAdd)
            val btnView = findViewById<Button>(R.id.btnView)

            var total = 0
            for (qty in quantities) {
                total += qty
            }
        }

        
















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}