package com.example.lutohomepage

import DataSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chose_chicken_pastel.*
import kotlinx.android.synthetic.main.activity_chose_sisig.*

class choseSisig : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_sisig)
        val i: Int = 2
        val Dataget = DataSet(i)
        sisigdes.text = Dataget.getdesc_dat()
        sisigdes2.text = Dataget.getingre_dat()
        sisigdes3.text = Dataget.getfood_dat()
        sisigdes4.text = Dataget.getresc_dat()
    }
}
