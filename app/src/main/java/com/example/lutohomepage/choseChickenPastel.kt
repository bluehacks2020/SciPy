package com.example.lutohomepage

import DataSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.Dataset
import android.widget.ImageView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_chose_chicken_pastel.*
import java.io.IOException

class choseChickenPastel : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_chicken_pastel)

        val i: Int = 0
        val Dataget = DataSet(i)
        cpdes.text = Dataget.getdesc_dat()
        cpdes2.text = Dataget.getingre_dat()
        cpdes3.text = Dataget.getfood_dat()
        cpdes4.text = Dataget.getresc_dat()

    }

}
