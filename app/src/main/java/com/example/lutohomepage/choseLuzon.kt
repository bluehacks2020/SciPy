package com.example.lutohomepage

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chose_luzon.*
import kotlinx.android.synthetic.main.content_chose_luzon.*

class choseLuzon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_luzon)
        setSupportActionBar(toolbar)


        centralLuzonText.setOnClickListener{
            val intent = Intent(this, choseCentralLuzon::class.java)
            startActivity(intent)
        }

        calabarzon.setOnClickListener{
            val intent = Intent(this, choseCalabarzon::class.java)
            startActivity(intent)
        }



    }
}
