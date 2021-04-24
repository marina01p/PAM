package com.example.laboratory1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityThirdBinding
import com.example.laboratory1.utils.AppConstants.bottomNavigation


class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

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
                R.id.my_profile -> {val intent = Intent(this, ThirdActivity::class.java)
                    startActivity(intent) }
                R.id.posts -> { val intent = Intent(this, FifthActivity::class.java)
                    startActivity(intent) }
                R.id.randomise -> { val intent = Intent(this, FourthActivity::class.java)
                    startActivity(intent) }
                R.id.users -> { val intent = Intent(this, SixthActivity::class.java)
                    startActivity(intent) }
                R.id.games -> { val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent) }
            }
            true
        }
    }
}