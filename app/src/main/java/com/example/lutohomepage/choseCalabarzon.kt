package com.example.lutohomepage

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chose_calabarzon.*
import kotlinx.android.synthetic.main.content_chose_calabarzon.*

class choseCalabarzon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_calabarzon)
        setSupportActionBar(toolbar)

        luzonlechon.setOnClickListener{
            val intent = Intent(this, choseLuzonLechon::class.java)
            startActivity(intent)
        }

    }
}
