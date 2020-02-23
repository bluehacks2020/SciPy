package com.example.lutohomepage

import DataSet
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_chose_central_luzon.*
import kotlinx.android.synthetic.main.content_chose_central_luzon.*

class choseCentralLuzon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_central_luzon)
        setSupportActionBar(toolbar)

        chickenPastel.setOnClickListener{
            val intent = Intent(this, choseChickenPastel::class.java)
            startActivity(intent)
        }

        sisig.setOnClickListener{
            val intent = Intent(this, choseSisig::class.java)
            startActivity(intent)
        }
    }
}
