package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
    }

    private fun setListners() {
      val clickableviews: List<View> =
          listOf(boxonetext,boxtwotext,boxthreetext,boxthreetext,boxfourtext,boxfivetext,layout,
          red_button,yellow_button,green_button)
        for (item:View in clickableviews){
            item.setOnClickListener{makeColored(it)}
        }
    }
    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.boxonetext -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxtwotext -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.boxthreetext -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxfourtext -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxfivetext -> view.setBackgroundResource(android.R.color.holo_green_light)
// Boxes using custom colors for background
            R.id.red_button -> boxthreetext.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxfourtext.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxfivetext.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}

