package com.example.lutohomepage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        luzonImage.setOnClickListener{
            val intent = Intent(this, choseLuzon::class.java)
            startActivity(intent)
        }

        visayasImage.setOnClickListener{
            val intent = Intent(this, choseVisayas::class.java)
            startActivity(intent)
        }

        mindanaoImage.setOnClickListener{
            val intent = Intent(this, choseMindanao::class.java )
            startActivity(intent)
        }
    }

}
