package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

  class MainActivity : AppCompatActivity(){
      lateinit var textView : TextView
      lateinit var button: Button
     lateinit var button1: Button
     var num = 0



      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textedit)
       button = findViewById(R.id.button)
       button1 = findViewById(R.id.button_)

         button.setOnClickListener { changeable(true) }
          button1.setOnClickListener{ changeable(false) }

    }

      fun changeable(add : Boolean){
         if (add) {
            num++
         } else {
            num--
        }
        textView.text=num.toString()
   }
  }
