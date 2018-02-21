package com.androidnex.dev.sampletoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class KotlinToastActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Default Toast
        val defaulttoast = findViewById<Button>(R.id.default_toast)

        defaulttoast.setOnClickListener {
            Toast.makeText(applicationContext, "This is Default Toast Message", Toast.LENGTH_LONG).show()
        }


        // Custom Toast
        val customtoast = findViewById<Button>(R.id.custom_toast)

        customtoast.setOnClickListener {
            val inflater = layoutInflater
            val layout = inflater.inflate(R.layout.custom_toast,
                    findViewById(R.id.custom_toast_container))

            val text = layout.findViewById<TextView>(R.id.text)
            text.text = "This is a custom toast"

            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.BOTTOM, 0, 32)
            toast.duration = Toast.LENGTH_LONG
            toast.view = layout
            toast.show()
        }

    }
}
