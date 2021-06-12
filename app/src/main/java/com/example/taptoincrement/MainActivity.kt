package com.example.taptoincrement

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val Tag: String? = "Showing Info"
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            count += 1000
            valueTV.text = "$$count"

            when (count){
                10000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.teal_700))
                    Toast.makeText(this, "Color Changed Started", Toast.LENGTH_SHORT)
                        .show()
                }
                20000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.purple_200))
                }
                30000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.teal_700))
                }
                40000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.teal_700))
                }
                50000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.teal_700))
                }
                60000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.teal_700))
                }
                else -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    valueTV.setTextColor(getColor(R.color.black))
                }
            }

        }
        button2.setOnClickListener {
            Log.d(Tag,  "Thread Started")
        }
    }
}