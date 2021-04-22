package com.example.laboratory1

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityThirdBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding
    lateinit var bottomNavigation : BottomNavigationView

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.userName.text = "Marina"
        binding.setAvatar.setImageResource(R.drawable.avatar_female_img)

        binding.goToListBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("myName", binding.userName.text.toString())
            intent.putExtra("myPost", binding.yourTxtArea.text.toString())
            startActivity(intent)
        }

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.selectedItemId = R.id.my_profile
        bottomNavigation.performClick()

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.my_profile -> {
                    val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent)
                }
                R.id.posts -> {
                    val intent = Intent(this, FifthActivity::class.java)
                    startActivity(intent)
                }
                R.id.randomise -> {
                    val intent = Intent(this, FourthActivity::class.java)
                    startActivity(intent)
                }
                R.id.users -> {
                    val intent = Intent(this, SixthActivity::class.java)
                    startActivity(intent)
                }
                R.id.exit -> {
                    val builder = AlertDialog.Builder(this)
                    builder.setTitle("Log out")
                    builder.setMessage("Do you want to log out?")
                    builder.setPositiveButton("Yes") { _: DialogInterface, _: Int ->
                        finish()
                    }
                    builder.setNegativeButton("No") { _: DialogInterface, _: Int -> }
                    builder.show()
                }
            }
            true
        }
    }
}