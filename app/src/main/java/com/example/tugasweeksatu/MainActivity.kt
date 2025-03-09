package com.example.tugasweeksatu

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonSayHello = findViewById<Button>(R.id.buttonSayHello)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonSayHello.setOnClickListener {
            val name = editTextName.text.toString().trim()
            if (name.isNotEmpty()) {
                textViewResult.text = getString(R.string.hello_message, name)
            } else {
                textViewResult.text = getString(R.string.empty_name_warning)
            }
        }
    }
}
