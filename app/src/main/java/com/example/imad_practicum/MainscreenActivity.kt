package com.example.imad_practicum

import android.os.Bundle
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

        //using array to organise a checklist
        val items = arrayOf<String>("Item=tent, category=shelter, quantity=1, comments=4 person and water proof",
            "item=marshmallows, category=food, quantity=3, comment=for S'mores (mega size",
            "item=flashlight, category=safety, quantity=2, comment=check for batteries(AA)")// adding the information

        fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.mainscreen) //declaring array

            //get the items text view
            val itemsTextView = findViewById<TextView>(R.id.itemsTextView)
            //set the text views text to the first item.
            itemsTextView.text = items[0]

            //add all items to the display string
            var itemsDisplay = ""
            itemsDisplay +="${items[0]}\n"
            itemsDisplay +="${items[1]}\n"
            itemsDisplay +="${items[2]}\n"

            //now set the item text view to show the item display
            itemsTextView.text = itemsDisplay
        }













        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}