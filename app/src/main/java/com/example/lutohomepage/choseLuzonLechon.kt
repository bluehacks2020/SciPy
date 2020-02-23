package com.example.lutohomepage

import DataSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chose_chicken_pastel.*
import kotlinx.android.synthetic.main.activity_chose_luzon_lechon.*

class choseLuzonLechon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_luzon_lechon)
        val i: Int = 1
        val Dataget = DataSet(i)
        lldes.text = Dataget.getdesc_dat()
        lldes2.text = Dataget.getingre_dat()
        lldes3.text = Dataget.getfood_dat()
        lldes4.text = Dataget.getresc_dat()

    }
}
