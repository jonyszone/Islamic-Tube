
package com.example.taptoincrement

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.inflate
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.taptoincrement.databinding.ActivityMainBinding
import com.example.taptoincrement.databinding.ActivityMainBinding.bind
import com.example.taptoincrement.databinding.ActivityMainBinding.inflate


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val TAG: String = "Showing Info"
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(LayoutInflater.from(this))
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            count += 1000
            binding.valueTV.text = "$$count"

            when (count){
                10000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.teal_700))
                    Toast.makeText(this, "Color Changed Started", Toast.LENGTH_SHORT)
                        .show()
                }
                20000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.purple_200))
                    binding.valueTV.textSize = 25F
                }
                30000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.teal_700))
                    binding.valueTV.textSize = 30F
                }
                40000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.teal_700))
                    binding.valueTV.textSize = 35F
                }
                50000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.teal_700))
                }
                60000 -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.teal_700))
                    binding.valueTV.textSize = 45F;
                }
                else -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    binding.valueTV.setTextColor(getColor(R.color.black))
                }
            }

        }
    }
}