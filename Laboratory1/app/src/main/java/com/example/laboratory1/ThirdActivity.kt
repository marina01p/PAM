package com.example.laboratory1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.laboratory1.databinding.ActivityThirdBinding


class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val receivedLogName = intent.getStringExtra("userNameLog")
        val receivedRegName = intent.getStringExtra("userNameReg")

        if(receivedLogName != null) {
            binding.userName.text = "$receivedLogName"
        } else {
            binding.userName.text = "$receivedRegName"
        }

        val receivedGender = intent.getStringExtra("genderSpinner")

        if(receivedGender == "F") {
            binding.setAvatar.setImageResource(R.drawable.avatar_female_img)
        } else if (receivedGender == "M") {
            binding.setAvatar.setImageResource(R.drawable.avatar_male_img)
        }

        binding.goToListBtn.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            intent.putExtra("myName", binding.userName.text.toString())
            intent.putExtra("myPost", binding.yourTxtArea.text.toString())
            startActivity(intent)
        }

        binding.goToMainBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

        binding.goToRandomBtn.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        binding.goToContacts?.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }
    }
}