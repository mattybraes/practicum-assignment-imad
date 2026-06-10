package com.example.imad_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private val MainscreenActivity.total: String

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
            onCreate(savedInstanceState)
            setContentView(R.layout.mainscreen)// will appear on the second page

            findViewById<TextView>(R.id.txtTotal)// button that will display all total
            findViewById<Button>(R.id.btnAdd)
            findViewById<Button>(R.id.btnView)

            var total = 0
            for (qty in quantities) {
                total += qty
            }
        }

        txtTotal.text = "total items packed: $total"
        btnAdd.setOnClickListener {
            items.add("sleeping bag")
            categories.add("shelter")
            quantities.add(1)

            Toast.makeText(this, "gear added", toast.LENGHT_SHORT).show()

            total = 0

            for (qty in quantities) {
                total += qty


                txtTotal.text = "total items packed: $total"

                btnView.setOnClickListener

                val intent  = Intent(this, DetailActivty::class.java)

                intent.PutStringArrayListExtra("items", items)
                intent.PutStringArrayListExtra("categories", categories)
                intent.PutStringArrayListExtra("quantities", quantities)
                startActivity(intent)

            }
        }

















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun PutStringArrayListExtra(string: String, items: ArrayList<String>) {


    }
}